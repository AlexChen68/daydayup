package tech.alexchen.daydayup.designpattern.creational.factorymethod;

/**
 * 工厂抽象类
 *
 * @author AlexChen
 * @date 2022-06-06 06:09
 */
public abstract class AbstractFactory {

    /**
     * 创建具体产品
     *
     * @return Product
     */
    abstract Product createProduct();
}
