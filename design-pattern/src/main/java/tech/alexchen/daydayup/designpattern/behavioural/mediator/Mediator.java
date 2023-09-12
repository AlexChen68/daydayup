package tech.alexchen.daydayup.designpattern.behavioural.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象中介者类
 *
 * @author alexchen
 * @date 2023/3/6
 */
public abstract class Mediator {
    protected List<Colleague> colleagues = new ArrayList<>();

    public Mediator register(Colleague colleague) {
        colleagues.add(colleague);
        return this;
    }

    // 声明抽象的业务方法
    public abstract void operation(String info);
}
