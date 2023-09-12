package tech.alexchen.daydayup.java.concurrent.communication;

import cn.hutool.core.util.StrUtil;
import org.junit.jupiter.api.Test;

/**
 * @author alexchen
 * @date 2023/3/15
 */
public class WaitAndNotifyTest {

    private static Object lock = new Object();
    static class Task implements Runnable {
        @Override
        public void run() {
            synchronized (lock) {
                for (int i = 0; i < 5; i++) {
                    try {
                        System.out.println(StrUtil.format("Thread {}: {}", Thread.currentThread().getName(), i));
                        // 唤醒其他使用该锁的线程
                        lock.notify();
                        // 陷入等待并释放lock锁，如果不放开锁，其他线程依旧无法拿到锁，无法执行
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                lock.notify();
            }
        }
    }
    @Test
    void notifyTest() throws InterruptedException {
        new Thread(new Task(), "A").start();
        // 等待一会，让 A 获取 锁
        Thread.sleep(10);
        new Thread(new Task(), "B").start();
    }
}
