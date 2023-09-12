package tech.alexchen.daydayup.java.concurrent.thread;

import org.junit.jupiter.api.Test;

/**
 * @author alexchen
 * @date 2023/3/16
 */
public class SleepTest {

    private static Object lock = new Object();

    static class Task implements Runnable {
        @Override
        public void run() {
            synchronized(lock) {
                try {
                    System.out.println(Thread.currentThread().getName() + " start");
                    // sleep 不会释放锁，而 wait 会
                    Thread.sleep(1000);
//                    lock.wait();
                    System.out.println(Thread.currentThread().getName() + " end");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    @Test
    void test() throws InterruptedException {
        new Thread(new Task(), "A").start();
        Thread.sleep(10);
        new Thread(new Task(), "B").start();
        Thread.sleep(3000);
    }
}
