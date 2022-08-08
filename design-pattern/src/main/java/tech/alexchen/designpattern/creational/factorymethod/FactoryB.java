package tech.alexchen.designpattern.creational.factorymethod;

/**
 * @author AlexChen
 * @date 2022-06-06 06:11
 */
public class FactoryB extends AbstractFactory {

    @Override
    Product createProduct() {
        return new ConcreteProductB();
    }
}
