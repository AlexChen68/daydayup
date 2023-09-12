package tech.alexchen.daydayup.designpattern.creational.simplefactory;

/**
 * 简单工厂模式(Simple Factory Pattern)：
 * 定义一个工厂类，它可以根据参数的不同返回不同类的实例，被创建的实例通常都具有共同的父类，
 * 这样做能把客户类和具体子类的实现解耦，客户类不再需要知道有哪些子类以及应当实例化哪个子类。
 * 因为在简单工厂模式中用于创建实例的方法是静态(static)方法，因此简单工厂模式又被称为静态工厂方法(Static Factory Method)模式，它属于类创建型模式。
 *
 * @author alexchen
 * @date 2022/1/24
 */
public class Client {

    public static void main(String[] args) {
        ProductFactory factory = new ProductFactory();
        Product product = factory.createProduct("A");
    }
}
