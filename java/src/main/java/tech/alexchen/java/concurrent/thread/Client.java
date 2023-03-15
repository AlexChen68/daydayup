package tech.alexchen.java.concurrent.thread;

import cn.hutool.core.util.StrUtil;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/**
 * 线程调用
 *
 * @author alexchen
 * @date 2022/7/31
 */
public class Client {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        concreteThread();
//        runnableThread();
        callableThread();
    }

    private void a() {
    }

    public static void concreteThread() {
        // 方式一
        ConcreteThread concreteThread = new ConcreteThread("");
        // 设置线程名称
        concreteThread.setName("concreteThread");
        // 启动线程，然后由JVM 调用此线程的 run() 方法
        concreteThread.start();
        // 封装线程执行的代码，直接调用相当于调用普通方法，是由主线程调用的
//        concreteThread.run();
    }

    public static void runnableThread() {
        // 方式二
        ConcreteRunnable runnable = new ConcreteRunnable();
        Thread runnableThread = new Thread(runnable, "runnableThread");
        runnableThread.start();
        // lambda 写法
        Runnable lambdaRunnable = () -> System.out.println(StrUtil.format("{}:{}", Thread.currentThread().getName(), Thread.currentThread().getId()));
        Thread lambdaRunnableThread = new Thread(lambdaRunnable, "lambdaRunnableThread");
        lambdaRunnableThread.start();
    }

    public static void callableThread() throws ExecutionException, InterruptedException {
        // 方式三
        ConcreteCallable callable = new ConcreteCallable();
        FutureTask task = new FutureTask(callable);
        Thread callableThread = new Thread(task, "callableThread");
        callableThread.start();
        System.out.println(task.get());
    }

}
