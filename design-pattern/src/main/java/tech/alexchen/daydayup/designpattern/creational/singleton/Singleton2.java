package tech.alexchen.daydayup.designpattern.creational.singleton;

/**
 * 转载自：<a href="https://pdai.tech/md/dev-spec/pattern/2_singleton.html">创建型 - 单例模式(Singleton pattern)</a><br/>
 * 同步锁:<br/>
 * 在懒汉式的前提下，对 getInstance 方法加同步锁，那么在一个时间点只能有一个线程能够进入该方法，从而避免了多次实例化 uniqueInstance 的问题；
 * 但是当一个线程进入该方法之后，其它试图进入该方法的线程都必须等待，因此性能上有一定的损耗。
 *
 * @author AlexChen
 * @date 2022-06-06 06:54
 */
public class Singleton2 {

    private static Singleton2 uniqueInstance;

    public static synchronized Singleton2 getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton2();
        }
        return uniqueInstance;
    }
}
