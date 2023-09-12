package tech.alexchen.daydayup.java.concurrent.communication;

import cn.hutool.core.util.StrUtil;
import org.junit.jupiter.api.Test;

/**
 * @author alexchen
 * @date 2023/3/16
 */
public class ThreadLocalTest {

    @Test
    void test() throws InterruptedException {
        ThreadLocal<String> threadLocal = new ThreadLocal<>();
        Thread a = new Thread(new Task(threadLocal), "A");
        Thread b = new Thread(new Task(threadLocal), "B");
        a.start();
        b.start();
        a.join();
        b.join();

        System.out.println(threadLocal.get());
    }

    static class Task implements Runnable {
        private ThreadLocal<String> threadLocal;

        public Task(ThreadLocal<String> threadLocal) {
            this.threadLocal = threadLocal;
        }

        @Override
        public void run() {
            threadLocal.set(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(StrUtil.format("Thread {} 输出：{}", Thread.currentThread().getName(), threadLocal.get()));
        }
    }
}
