package tech.alexchen.designpattern.structural.composite;

/**
 * @author alexchen
 * @date 2023/3/4
 */
public class Client {
    public static void main(String[] args) {
        Component component;
        component = new Leaf();
        //component = new Composite();

        // 无须知道到底是叶子还是容器
        // 可以对其进行统一处理
        component.operation();
    }
}

