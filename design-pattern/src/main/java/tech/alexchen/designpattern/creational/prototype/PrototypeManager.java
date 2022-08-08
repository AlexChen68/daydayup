package tech.alexchen.designpattern.creational.prototype;

import java.util.Hashtable;
import java.util.Optional;

/**
 * 原型管理器：<br/>
 * 原型管理器(Prototype Manager)是将多个原型对象存储在一个集合中供客户端使用，它是一个专
 * 门负责克隆对象的工厂，其中定义了一个集合用于存储原型对象，如果需要某个原型对象的一个克
 * 隆，可以通过复制集合中对应的原型对象来获得。
 *
 * @author AlexChen
 * @date 2022-06-07 06:55
 */
public class PrototypeManager {

    public static String KEY = "ConcretePrototype";
    private static final Hashtable<String, Prototype> table = new Hashtable();
    private static final PrototypeManager uniqueInstance = new PrototypeManager();

    /**
     * 将需要复制的原型对象，在一个单例的管理器中，使用集合存储起来
     */
    private PrototypeManager() {
        table.put(KEY, new ConcretePrototype(new PrototypeInfo(1, "prototype")));
    }

    public static PrototypeManager getPrototypeManager() {
        return uniqueInstance;
    }

    public void addPrototype(String key, Prototype prototype) {
        table.put(key, prototype);
    }

    public Prototype getClonedPrototype(String key) {
        return Optional.ofNullable(table.get(key))
                .map(p -> p.shallowClone())
                .get();
    }
}
