package tech.alexchen.designpattern.behavioural.state;

/**
 * @author alexchen
 * @date 2023/3/5
 */
public class OnState implements State {
    @Override
    public void on(Switch s) {
        System.out.println("已经是打开的");
    }

    @Override
    public void off(Switch s) {
        s.setState(s.getOffState());
        System.out.println("关闭成功");
    }
}
