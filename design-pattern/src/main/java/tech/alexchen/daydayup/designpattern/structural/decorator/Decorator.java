package tech.alexchen.daydayup.designpattern.structural.decorator;

/**
 * @author alexchen
 * @date 2023/3/4
 */
public class Decorator implements Component {
    // 维持一个对抽象构件对象的引用
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
