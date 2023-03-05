package tech.alexchen.designpattern.behavioural.state;

/**
 * @author alexchen
 * @date 2023/3/5
 */
public class OffState implements State {
    @Override
    public void on(Switch s) {
        System.out.println("打开成功");
        s.setState(s.getOnState());
    }

    @Override
    public void off(Switch s) {
        System.out.println("已经是关闭的");
    }
}
