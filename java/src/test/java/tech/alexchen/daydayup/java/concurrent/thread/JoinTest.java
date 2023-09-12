package tech.alexchen.daydayup.java.concurrent.thread;

import org.junit.jupiter.api.Test;

/**
 * @author alexchen
 * @date 2023/3/16
 */
public class JoinTest {

    @Test
    void test() throws InterruptedException {
        Thread thread = new Thread(() -> {
            try {
                System.out.println("我是子线程，我先睡一秒");
                Thread.sleep(1000);
                System.out.println("我是子线程，我睡完了一秒");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread.start();
        // 让当前线程等待 thread 线程先执行完毕
        thread.join();
        System.out.println("如果不加join方法，我会先被打出来，加了就不一样了");
    }
}
