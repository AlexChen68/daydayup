package tech.alexchen.daydayup.designpattern.behavioural.strategy;

/**
 * @author alexchen
 * @date 2023/3/5
 */
public class Context {

    Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void doSomething() {
        strategy.behavior();
    }

}
