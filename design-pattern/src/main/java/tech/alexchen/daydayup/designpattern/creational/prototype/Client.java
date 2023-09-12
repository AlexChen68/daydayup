package tech.alexchen.daydayup.designpattern.creational.prototype;

/**
 * 从克隆程度角度，可以分为"浅克隆"和"深克隆"两种：<br/>
 * 1、浅克隆：<br/>
 * 在浅克隆中，如果原型对象的成员变量是值类型，将复制一份给克隆对象；如果原型对象的成员变量
 * 是引用类型，则将引用对象的地址复制一份给克隆对象，也就是说原型对象和克隆对象的成员变量指
 * 向相同的内存地址。简单来说，在浅克隆中，当对象被复制时只复制它本身和其中包含的值类型的成
 * 员变量，而引用类型的成员对象并没有复制。<br/>
 * 在Java语言中，通过覆盖Object类的clone()方法可以实现浅克隆，前提是具体原型类必须实现
 * 一个标识接口 Cloneable，否则将抛出异常。<br/>
 * 2、深克隆：<br/>
 * 在深克隆中，无论原型对象的成员变量是值类型还是引用类型，都将复制一份给克隆对象，深克隆将
 * 原型对象的所有引用对象也复制一份给克隆对象。简单来说，在深克隆中，除了对象本身被复制外，
 * 对象所包含的所有成员变量也将复制。<br/>
 * 在Java语言中，如果需要实现深克隆，可以通过序列化(Serialization)等方式来实现。序列化就
 * 是将对象写到流的过程，写到流中的对象是原有对象的一个拷贝，而原对象仍然存在于内存中。通过
 * 序列化实现的拷贝不仅可以复制对象本身，而且可以复制其引用的成员对象，因此通过序列化将对象
 * 写到一个流中，再从流里将其读出来，可以实现深克隆。需要注意的是能够实现序列化的对象其类必
 * 须实现Serializable接口，否则无法实现序列化操作。
 *
 * @author AlexChen
 * @date 2022-06-07 06:07
 */
public class Client {

    public static void main(String[] args) throws Exception {
//        compareClone();
        cloneByManager();
    }

    public static void compareClone() throws Exception {
        PrototypeInfo info = new PrototypeInfo(1, "prototype");
        ConcretePrototype prototype = new ConcretePrototype(info);
        //测试浅克隆
        ConcretePrototype shallowClone = prototype.shallowClone();
        //  false
        System.out.println(prototype == shallowClone);
        //  true
        System.out.println(prototype.getInfo() == shallowClone.getInfo());

        //测试深克隆
        ConcretePrototype deepClone = prototype.deepClone();
        //  false
        System.out.println(prototype == deepClone);
        //  false
        System.out.println(prototype.getInfo() == deepClone.getInfo());
    }

    public static void cloneByManager() {
        PrototypeManager manager = PrototypeManager.getPrototypeManager();
        ConcretePrototype clonedPrototype = (ConcretePrototype) manager.getClonedPrototype(PrototypeManager.KEY);
        System.out.println(clonedPrototype.getInfo().toString());
    }
}
