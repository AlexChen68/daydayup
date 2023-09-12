package tech.alexchen.daydayup.java.concurrent.executor;

import cn.hutool.core.util.RandomUtil;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * @author alexchen
 * @date 2023/3/9
 */
@Slf4j
public class ThreadPoolExecutorTest {

    /**
     * corePoolSize == poolSize
     */
    @Test
    void coreSizeTest() {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 10, 60L,
                TimeUnit.SECONDS, new LinkedBlockingQueue<>(20), new CustomRejectedExecutionHandler());
        // 6 个认为，5 个由核心线程执行，多余的先插入队列，待线程空闲时安排执行
        execute(executor, 6);
    }

    /**
     * corePoolSize < poolSize == maximumPoolSize 且队列未满
     */
    @Test
    void maximumPoolSize() {
        // 最多可以并行执行 10 + 20 = 30 个
        ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 10, 60L,
                TimeUnit.SECONDS, new LinkedBlockingQueue<>(20), new CustomRejectedExecutionHandler());
        // 超过了核心线程 5 + 队列长度 20 = 25，会额外创建 3 个线程用于执行多余的认为
        execute(executor, 28);
    }

    /**
     * corePoolSize < poolSize == maximumPoolSize 且队列未满
     */
    @Test
    void rejectExecutionHandlerTest() {
        // 最多可以并行执行 10 + 20 = 30 个
        ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 10, 60L,
                TimeUnit.SECONDS, new LinkedBlockingQueue<>(20), new CustomRejectedExecutionHandler());
        // 超过了最大线程数 10 + 队列长度 20 = 30，超出的部分会按照 RejectedExecutionHandler 的拒绝策略进行处理
        execute(executor, 35);
    }

    @Test
    @SneakyThrows
    void submitTest() {
        int num = 10;
        ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 5, 0, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<>(2), new CustomRejectedExecutionHandler());
        Future<String> task = executor.submit(new WorkerCallable());
        // 执行 Future 的 get 方法，会阻塞线程
        log.info("return info: {}", task.get());
        executor.shutdown();
    }


    @SneakyThrows
    void execute(ThreadPoolExecutor executor, int num) {
        for (int i = 0; i < num; i++) {
            Runnable runnable = new WorkerThread();
            executor.execute(runnable);
        }
        // 启动有序关闭，在该关闭中执行以前提交的任务，但不接受任何新任务。如果调用已关闭，则不会产生其他影响。
        executor.shutdown();
        while (!executor.awaitTermination(100, TimeUnit.MILLISECONDS)) {
            log.info("pool size: {}, active threads: {}, queued tasks: {}, completed tasks: {}",
                    executor.getPoolSize(),
                    executor.getActiveCount(),
                    executor.getQueue().size(),
                    executor.getCompletedTaskCount()
            );
        }
        System.out.println("Finished all threads");
    }

    static class WorkerThread implements Runnable {
        @Override
        public void run() {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    static class CustomRejectedExecutionHandler implements RejectedExecutionHandler {

        @Override
        public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
            log.error("Task {} rejected from {}", r.toString(), executor.toString());
        }
    }

    static class WorkerCallable implements Callable<String> {
        @Override
        public String call() throws Exception {
            Thread.sleep(1000L);
            return RandomUtil.randomString(10);
        }
    }
}
