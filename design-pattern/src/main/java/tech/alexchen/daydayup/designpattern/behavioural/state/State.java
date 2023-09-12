package tech.alexchen.daydayup.designpattern.behavioural.state;

/**
 * @author alexchen
 * @date 2023/3/5
 */
public interface State {

    void on(Switch s);

    void off(Switch s);
}
