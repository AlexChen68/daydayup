package tech.alexchen.daydayup.designpattern.creational.singleton;

/**
 * 转载自：<a href="https://pdai.tech/md/dev-spec/pattern/2_singleton.html">创建型 - 单例模式(Singleton pattern)</a><br/>
 * <p>
 * 静态内部类:<br/>
 * 当 Singleton 类加载时，静态内部类 SingletonHolder 没有被加载进内存，
 * 只有当调用 getUniqueInstance() 方法从而触发 SingletonHolder.INSTANCE 时 SingletonHolder 才会被加载，此时初始化 INSTANCE 实例。
 * 这种方式不仅具有延迟初始化的好处，而且由虚拟机提供了对线程安全的支持。
 *
 * @author AlexChen
 * @date 2022-06-06 06:54
 */
public class Singleton4 {

    public static Singleton4 getInstance() {
        return SingletonHolder.uniqueInstance;
    }

    private static class SingletonHolder {
        private static final Singleton4 uniqueInstance = new Singleton4();
    }
}
