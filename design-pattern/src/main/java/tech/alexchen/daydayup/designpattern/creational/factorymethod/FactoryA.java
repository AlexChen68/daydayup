package tech.alexchen.daydayup.designpattern.creational.factorymethod;

/**
 * @author AlexChen
 * @date 2022-06-06 06:11
 */
public class FactoryA extends AbstractFactory {

    @Override
    Product createProduct() {
        return new ConcreteProductA();
    }
}
