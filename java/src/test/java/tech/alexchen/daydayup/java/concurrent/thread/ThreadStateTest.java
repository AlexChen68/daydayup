package tech.alexchen.daydayup.java.concurrent.thread;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * @author alexchen
 * @date 2023/3/6
 */
@Slf4j
public class ThreadStateTest {

    @Test
    void testStateNew() {
        Thread thread = new Thread(() -> {});
        System.out.println(thread.getState()); // 输出 NEW
        thread.start();
        System.out.println(thread.getState()); // 输出 NEW
    }

    class BlockTestRunnable implements Runnable {
        @Override
        public void run() {
            testMethod();
        }
    }

    private synchronized void testMethod() {
        try {
            log.info("Thread {} get locked", Thread.currentThread().getName());
            Thread.sleep(1000L);
            log.info("Thread {} release lock", Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    @SneakyThrows
    public void blockedTest() {
        Thread a = new Thread(new BlockTestRunnable(), "A");
        Thread b = new Thread(new BlockTestRunnable(), "B");
        a.start();
        b.start();

        int count = 200;
        long step = 10L;
        while (true) {
            log.info("Thread A's state : {} and Thread B's state : {}", a.getState(), b.getState());
            Thread.sleep(step);
            if (count-- < 0) {
                break;
            }
        }
    }

    @Test
    @SneakyThrows
    public void waitingTest() {
        Thread a = new Thread(new BlockTestRunnable(), "A");
        Thread b = new Thread(new BlockTestRunnable(), "B");
        a.start();
        // 执行 Thread.join() 方法后，会等待线程 A 全部执行完毕，即状态变为终止
        a.join();
        b.start();

        int count = 10;
        long step = 100L;
        while (true) {
            log.info("Thread A's state : {} and Thread B's state : {}", a.getState(), b.getState());
            Thread.sleep(step);
            if (count-- < 0) {
                break;
            }
        }
    }

    @Test
    @SneakyThrows
    public void timedWaitingTest() {
        Thread a = new Thread(new BlockTestRunnable(), "A");
        Thread b = new Thread(new BlockTestRunnable(), "B");
        a.start();
        // 执行 Thread.join(long) 方法后，会等待线程 A 执行指定的时间
        a.join(500L);
        b.start();

        int count = 10;
        long step = 100L;
        while (true) {
            log.info("Thread A's state : {} and Thread B's state : {}", a.getState(), b.getState());
            Thread.sleep(step);
            if (count-- < 0) {
                break;
            }
        }
    }

}
