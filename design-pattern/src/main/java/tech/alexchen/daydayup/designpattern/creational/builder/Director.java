package tech.alexchen.daydayup.designpattern.creational.builder;

/**
 * Director（指挥者）：<br/>
 * 指挥者又称为导演类，它负责安排复杂对象的建造次序，指挥者与抽象建造者之间存在关联关系，
 * 可以在其 construct() 建造方法中调用建造者对象的部件构造与装配方法，完成复杂对象的建造。
 * 客户端一般只需要与指挥者进行交互，在客户端确定具体建造者的类型，并实例化具体建造者对象（也可以
 * 通过配置文件和反射机制），然后通过指挥者类的构造函数或者 Setter 方法将该对象传入指挥者类中。
 * 也可以省略指挥者类，由抽象构造者统一负责构造过程。
 *
 * @author AlexChen
 * @date 2022-05-01 03:56
 */
public class Director {

    /**
     * 生成器对象，使用父类，可以灵活替换子类
     */
    private final Builder builder;

    /**
     * 构造方法，传入构造器对象，具体实例化哪个构造器子类，由调用者决定
     *
     * @param builder
     */
    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * 生成过程：调用生成器的生成方法，返回生成的产品
     */
    public Product construct() {
        return builder.buildProcessA()
                .buildProcessB()
                .buildProcessC()
                .build();
    }
}
