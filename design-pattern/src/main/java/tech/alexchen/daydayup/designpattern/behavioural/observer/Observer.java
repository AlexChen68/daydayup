package tech.alexchen.daydayup.designpattern.behavioural.observer;

/**
 * @author alexchen
 * @date 2023/3/5
 */
public interface Observer {
    void update(float temp, float humidity, float pressure);
}
