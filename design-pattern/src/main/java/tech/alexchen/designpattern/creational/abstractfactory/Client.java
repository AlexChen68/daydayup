package tech.alexchen.designpattern.creational.abstractfactory;

/**
 * 抽象工厂模式(Abstract Factory Pattern)：<br/>
 * 提供一个创建一系列相关或相互依赖对象的接口，而无须指定它们具体的类。抽象工厂模式又称为Kit模式，它是一种对象创建型模式。
 * 抽象工厂可以认为是多个工厂模式组合而成。
 *
 * @author alexchen
 * @date 2022/4/22
 */
public class Client {

    public static void main(String[] args) {
        AbstractFactory factory = new Factory1();
        //通过 Factory1 创建出来的产品 A 和产品 B 都是产品中的第1种实例，即一类产品族
        ProductA productA = factory.createProductA();
        ProductB productB = factory.createProductB();
    }
}



