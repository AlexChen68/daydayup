package tech.alexchen.designpattern.behavioural.memento;

/**
 * 备忘录仅允许 Originator 来调用其方法
 *
 * @author alexchen
 * @date 2023/3/6
 */
public class Memento {

    private String state;

    protected Memento(String state) {
        this.state = state;
    }

    protected String getState() {
        return state;
    }

}
