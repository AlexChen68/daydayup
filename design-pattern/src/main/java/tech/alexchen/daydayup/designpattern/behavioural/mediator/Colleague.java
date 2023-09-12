package tech.alexchen.daydayup.designpattern.behavioural.mediator;

/**
 * 抽象同事类
 *
 * @author alexchen
 * @date 2023/3/6
 */
public abstract class Colleague {
    // 维持一个抽象中介者的引用
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    // 定义依赖方法，与中介者进行通信
    public void onEvent(String info) {
        mediator.operation(info);
    }
}
