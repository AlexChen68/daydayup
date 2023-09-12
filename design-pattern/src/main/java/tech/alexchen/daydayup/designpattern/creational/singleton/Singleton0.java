package tech.alexchen.daydayup.designpattern.creational.singleton;

/**
 * 转载自：<a href="https://pdai.tech/md/dev-spec/pattern/2_singleton.html">创建型 - 单例模式(Singleton pattern)</a><br/>
 * <p>
 * 饿汉式:<br/>
 * JVM 加载时就实例化，初始速度快，占用内存小，线程安全；但是创建的时机不可控。
 *
 * @author AlexChen
 * @date 2022-06-06 06:54
 */
public class Singleton0 {

    private static final Singleton0 uniqueInstance = new Singleton0();

    public static Singleton0 getInstance() {
        return uniqueInstance;
    }
}
