package tech.alexchen.designpattern.structural.flyweight;

/**
 * @author alexchen
 * @date 2023/3/4
 */
public class Client {

    public static void main(String[] args) {
        Flyweight flyweight1 = FlyweightFactory.getFlyweight("123");
        Flyweight flyweight2 = FlyweightFactory.getFlyweight("123");
        flyweight1.doOperation("mysql");
        flyweight2.doOperation("redis");
    }
}
