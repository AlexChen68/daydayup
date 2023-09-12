package tech.alexchen.daydayup.java.concurrent.communication;

import cn.hutool.core.util.StrUtil;
import org.junit.jupiter.api.Test;

/**
 * 线程间通信测试之对象锁
 *
 * @author alexchen
 * @date 2023/3/15
 */
public class SynchronizedTest {

    private static Object lock = new Object();

    static class Task implements Runnable {
        @Override
        public void run() {
            synchronized (lock) {
                for (int i = 0; i < 100; i++) {
                    System.out.println(StrUtil.format("Thread {}: {}", Thread.currentThread().getName(), i));
                }
            }
        }
    }
    @Test
    void lockTest() throws InterruptedException {
        new Thread(new Task(), "A").start();
        // 等待一会，让 A 获取 锁
        Thread.sleep(10);
        new Thread(new Task(), "B").start();
    }
}
