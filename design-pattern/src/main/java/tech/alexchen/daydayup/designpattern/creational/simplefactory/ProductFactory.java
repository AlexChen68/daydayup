package tech.alexchen.daydayup.designpattern.creational.simplefactory;

/**
 * 产品简单工厂,根据参数判断产生的实例类型，返回需要的实例
 *
 * @author AlexChen
 * @date 2022-06-06 05:54
 */
public class ProductFactory {

    Product createProduct(String param) {
        switch (param) {
            case "A":
                return new ConcreteProductA();
            case "B":
                return new ConcreteProductB();
            default:
                return null;
        }
    }
}
