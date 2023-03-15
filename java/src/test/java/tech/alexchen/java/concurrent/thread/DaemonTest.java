package tech.alexchen.java.concurrent.thread;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * @author alexchen
 * @date 2023/3/16
 */
@Slf4j
public class DaemonTest {

    @Test
    void test() throws InterruptedException {
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
        // 设置 t1 为守护线程
        t1.setDaemon(true);
        t1.start();
        t2.start();
        // 等待 t2 结束
        t2.join();
        // t2 结束后，主线程就结束了，守护线程一起结束
    }
}
