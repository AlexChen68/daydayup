package tech.alexchen.designpattern.creational.abstractfactory;

/**
 * @author AlexChen
 * @date 2022-06-06 06:11
 */
public class Factory2 extends AbstractFactory {

    @Override
    ProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    ProductB createProductB() {
        return new ConcreteProductB2();
    }
}
