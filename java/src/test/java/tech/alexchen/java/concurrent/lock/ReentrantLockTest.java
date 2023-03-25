package tech.alexchen.java.concurrent.lock;

import org.junit.jupiter.api.Test;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author alexchen
 */
public class ReentrantLockTest {

    @Test
    void test() throws InterruptedException {
        Lock lock = new ReentrantLock();
        Condition condition = lock.newCondition();
        new Thread(() -> {
            lock.lock(); // 必须先持有锁，才能使用 await
            System.out.println("线程 1 进入等待状态");
            try {
                condition.await();  // 进入等待状态
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("线程 1 结束等待");
            lock.unlock();
        }).start();
        // 防止线程 2 先跑
        Thread.sleep(100);
        new Thread(() -> {
            lock.lock();
            System.out.println("线程 2 唤醒其他线程");
            condition.signal(); // 唤醒其他线程，但是需要等待本线程释放锁之后，才能继续运行
            System.out.println("线程 2 结束");
            lock.unlock(); // 线程 2 释放锁
        }).start();
    }
}
