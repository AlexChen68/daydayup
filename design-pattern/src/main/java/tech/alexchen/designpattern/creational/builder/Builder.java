package tech.alexchen.designpattern.creational.builder;

/**
 * Builder（抽象建造者）：<br/>
 * 它为创建一个产品Product对象的各个部件指定抽象接口，在该接口中一般声明两类方法，
 * 一类方法是buildProcessX()，它们用于创建复杂对象的各个部件；
 * 另一类方法是getProduct()，它们用于返回复杂对象。
 * Builder既可以是抽象类，也可以是接口。
 *
 * @author alexchen
 * @date 2022/4/28
 */
public abstract class Builder {

    Product product = new Product();

    /**
     * 生成过程 A
     */
    abstract Builder buildProcessA();

    /**
     * 生成过程 B
     */
    abstract Builder buildProcessB();

    /**
     * 生成过程 C
     */
    abstract Builder buildProcessC();

    /**
     * 返回创建好的产品
     *
     * @return
     */
    public Product build() {
        return product;
    }
}
