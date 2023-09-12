package tech.alexchen.daydayup.designpattern.behavioural.observer;

/**
 * @author alexchen
 * @date 2023/3/5
 */
public interface Subject {
    void resisterObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();
}
