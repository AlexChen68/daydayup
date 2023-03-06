package tech.alexchen.java.concurrent;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import tech.alexchen.java.concurrent.thread.ConcreteCallable;
import tech.alexchen.java.concurrent.thread.ConcreteRunnable;
import tech.alexchen.java.concurrent.thread.ConcreteThread;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;

/**
 * @author alexchen
 * @date 2023/3/6
 */
@Slf4j
public class ThreadTest {

    @Test
    void runnableTest() {
        Thread thread = new Thread(new ConcreteRunnable(), "ConcreteRunnableThread");
        thread.start();
    }

    @Test
    void threadTest() {
        Thread thread = new ConcreteThread("ConcreteThread");
        thread.start();
    }

    @Test
    @SneakyThrows
    void CallableTest() {
        Callable callable = new ConcreteCallable();
        FutureTask task = new FutureTask(callable);
        Thread callableThread = new Thread(task, "CallableThread");
        callableThread.start();
        log.info("Call value: {}", task.get());
    }


    @Test
    void joinTest() throws InterruptedException {
        Thread t1 = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    log.info("Thread 1 ding ding ding " + i);
                    Thread.sleep(1000L);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                log.info("Thread 1 exit");
            }
        });
        Thread t2 = new Thread(() -> {
            try {
                // 关键语句：需要等 t1 执行关闭，才会开始执行 t2 剩下的逻辑
                t1.join();
                for (int i = 0; i < 5; i++) {
                    log.info("Thread 2 ding ding ding " + i);
                    Thread.sleep(1000L);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                log.info("Thread 2 exit");
            }
        });
        t1.start();
        t2.start();
        // 让 t2 执行完，主线程再退出
        t2.join();
    }
    @Test
    void daemonTest() throws InterruptedException {
        Thread t1 = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    log.info("Thread 1 ding ding ding " + i);
                    Thread.sleep(1000L);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                log.info("Thread 1 exit");
            }
        });
        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                log.info("Thread 2 exit");
            }
        });

        t1.setDaemon(true);

        t1.start();
        t2.start();
        Thread.sleep(2000L);
    }
}

