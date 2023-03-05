package tech.alexchen.designpattern.behavioural.strategy;

/**
 * @author alexchen
 * @date 2023/3/5
 */
public class ConcreteStrategy1 implements Strategy {

    @Override
    public void behavior() {
        System.out.println("ConcreteStrategy 1");
    }
}
