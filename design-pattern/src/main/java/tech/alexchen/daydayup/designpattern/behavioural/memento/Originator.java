package tech.alexchen.daydayup.designpattern.behavioural.memento;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author alexchen
 * @date 2023/3/6
 */
@Data
@AllArgsConstructor
public class Originator {

    private String state;

    public Memento backup() {
        return new Memento(this.state);
    }

    public void restore(Memento memento) {
        this.state = memento.getState();
    }
}
