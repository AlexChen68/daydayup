package tech.alexchen.java.concurrent.executor;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.concurrent.*;

/**
 * @author alexchen
 * @date 2023/3/7
 */
@Slf4j
public class ExecutorsTest {

    @Test
    void newFixedThreadPoolTest() {
        // 创建固定线程数为 5 的线程池
        ExecutorService executor = Executors.newFixedThreadPool(5);
        execute(executor);
    }

    @Test
    void newSingleThreadExecutor() {
        // 创建单线程执行器，任务按照顺序执行
        ExecutorService executor = Executors.newSingleThreadExecutor();
        execute(executor);
    }

    @Test
    void newCachedThreadPool() {
        // 创建一个最大线程数为 int 最大值的线程池
        ExecutorService executor = Executors.newCachedThreadPool();
        execute(executor);
    }

    @SneakyThrows
    void execute(ExecutorService executor) {
        for (int i = 0; i < 10; i++) {
            Runnable runnable = new WorkerThread();
            executor.execute(runnable);
        }
        // 启动有序关闭，在该关闭中执行以前提交的任务，但不接受任何新任务。如果调用已关闭，则不会产生其他影响。
        executor.shutdown();
        while (!executor.awaitTermination(10L, TimeUnit.SECONDS)) {
        }
        System.out.println("Finished all threads");
    }

    static class WorkerThread implements Runnable {
        @Override
        public void run() {
            log.info("{} started", Thread.currentThread().getName());
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            log.info("{} end", Thread.currentThread().getName());
        }
    }
}
