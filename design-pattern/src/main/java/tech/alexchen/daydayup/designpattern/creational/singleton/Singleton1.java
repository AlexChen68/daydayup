package tech.alexchen.daydayup.designpattern.creational.singleton;

/**
 * 转载自：<a href="https://pdai.tech/md/dev-spec/pattern/2_singleton.html">创建型 - 单例模式(Singleton pattern)</a><br/>
 * <p>
 * 懒汉式:<br/>
 * 需要的时候才实例化实例，节约资源；
 * 但是线程不安全，多线程执行 uniqueInstance 是否为 null 判断时，可能会重复实例化 uniqueInstance
 *
 * @author AlexChen
 * @date 2022-06-06 06:54
 */
public class Singleton1 {

    private static Singleton1 uniqueInstance;

    public static Singleton1 getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton1();
        }
        return uniqueInstance;
    }
}
