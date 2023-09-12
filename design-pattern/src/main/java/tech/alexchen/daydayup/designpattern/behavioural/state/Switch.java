package tech.alexchen.daydayup.designpattern.behavioural.state;

/**
 * @author alexchen
 * @date 2023/3/5
 */
public class Switch {

    private State state;
    private OnState onState;
    private OffState offState;

    private String name;

    public Switch(String name) {
        this.name = name;
        this.onState = new OnState();
        this.offState = new OffState();
        this.state = offState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public OnState getOnState() {
        return onState;
    }

    public OffState getOffState() {
        return offState;
    }

    public void on() {
        state.on(this);
    }

    public void off() {
        state.off(this);
    }
}
