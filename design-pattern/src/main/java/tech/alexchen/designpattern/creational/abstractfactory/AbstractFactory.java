package tech.alexchen.designpattern.creational.abstractfactory;

/**
 * 工厂抽象类
 *
 * @author AlexChen
 * @date 2022-06-06 06:09
 */
public abstract class AbstractFactory {

    /**
     * 创建具体产品 A
     *
     * @return Product
     */
    abstract ProductA createProductA();

    /**
     * 创建具体产品 B
     *
     * @return Product
     */
    abstract ProductB createProductB();
}
