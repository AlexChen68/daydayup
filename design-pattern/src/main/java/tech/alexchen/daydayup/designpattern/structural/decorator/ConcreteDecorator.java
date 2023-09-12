package tech.alexchen.daydayup.designpattern.structural.decorator;

/**
 * @author alexchen
 * @date 2023/3/4
 */
public class ConcreteDecorator extends Decorator {

    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        // 调用原有业务方法
        super.operation();
        // 调用新增业务方法
        addedBehavior();
    }

    // 新增业务方法
    public void addedBehavior() {
    }
}
