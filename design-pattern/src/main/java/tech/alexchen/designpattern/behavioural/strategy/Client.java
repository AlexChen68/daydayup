package tech.alexchen.designpattern.behavioural.strategy;

import java.util.Comparator;

/**
 * @author alexchen
 * @date 2023/3/5
 */
public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        context.setStrategy(new ConcreteStrategy1());
        context.doSomething();
    }
}
