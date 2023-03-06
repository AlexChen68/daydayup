package tech.alexchen.designpattern.behavioural.memento;

import com.sun.javaws.exceptions.InvalidArgumentException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author alexchen
 * @date 2023/3/6
 */
public class Caretaker {

    private Map<String, Memento> cache;

    public Caretaker() {
        this.cache = new HashMap<>();
    }

    public void saveMemento(String name, Memento memento) {
        if (memento == null) {
            throw new IllegalArgumentException("Memento cant be null");
        }
        cache.put(name, memento);
    }

    public Memento getMemento(String name) {
        return cache.get(name);
    }
}
