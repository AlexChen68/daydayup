package tech.alexchen.java.concurrent.thread;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.concurrent.*;

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
    @SneakyThrows
    void futureTaskTest() {
        ExecutorService executor = Executors.newCachedThreadPool();
        FutureTask<Integer> futureTask = new FutureTask<>(() -> 1024);
        executor.submit(futureTask);
        System.out.println(futureTask.get());
    }
}

