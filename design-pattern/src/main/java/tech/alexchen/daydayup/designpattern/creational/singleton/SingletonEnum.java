package tech.alexchen.daydayup.designpattern.creational.singleton;

/**
 * 转载自：<a href="https://pdai.tech/md/dev-spec/pattern/2_singleton.html">创建型 - 单例模式(Singleton pattern)</a><br/>
 * <p>
 * 枚举单例：<br/>
 * 这是单例模式的最佳实践，它实现简单，并且在面对复杂的序列化或者反射攻击的时候，能够防止实例化多次
 *
 * @author AlexChen
 * @date 2022-06-07 05:58
 */
public enum SingletonEnum {

    uniqueInstance
}
