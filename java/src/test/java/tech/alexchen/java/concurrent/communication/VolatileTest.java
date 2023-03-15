package tech.alexchen.java.concurrent.communication;

import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author alexchen
 * @date 2023/3/15
 */
public class VolatileTest {

    private static volatile AtomicInteger signal = new AtomicInteger(0);

    @Test
    void test() throws InterruptedException {
        new Thread(() -> {

            while (signal.get() < 5) {
                if (signal.get() % 2 == 0) {
                    System.out.println("Thread A: " + signal.get());
                    signal.getAndAdd(1);
                }
            }
        }, "A").start();

        Thread.sleep(1000);

        new Thread(() -> {
            while (signal.get() < 5) {
                if (signal.get() % 2 == 1) {
                    System.out.println("Thread B: " + signal.get());
                    signal.getAndAdd(1);
                }
            }
        }, "B").start();
    }
}
