package tech.alexchen.designpattern.creational.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 具体原型类，它实现在抽象原型类中声明的克隆方法，在克隆方法中返回自己的一个克隆对象;
 * 注意，在 Object 类提供了一个clone()方法，前提是具体原型类必须实现一个标识接口 Cloneable，否则将抛出异常；
 * 使用 Java 的序列化可以实现深克隆，具体做法为将对象写入流中，再从流中写出为新对象，注意原型对象及其属性需要实现序列化接口。
 *
 * @author AlexChen
 * @date 2022-06-07 06:05
 */
public class ConcretePrototype implements Prototype {

    /**
     * 模拟原型对象的属性，用于比较浅克隆和深克隆的区别；
     * 由于深克隆使用了序列化
     */
    private PrototypeInfo info;

    public ConcretePrototype() {
    }

    public ConcretePrototype(PrototypeInfo info) {
        this.info = info;
    }

    public PrototypeInfo getInfo() {
        return info;
    }

    public void setInfo(PrototypeInfo info) {
        this.info = info;
    }

    @Override
    public ConcretePrototype shallowClone() {
        try {
            //在Java语言中，通过覆盖Object类的clone()方法可以实现浅克隆
            Object object = super.clone();
            return (ConcretePrototype) object;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ConcretePrototype deepClone() throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        //写入流中
        objectOutputStream.writeObject(this);

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        //从流中取出
        return (ConcretePrototype) objectInputStream.readObject();
    }
}
