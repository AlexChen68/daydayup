package tech.alexchen.daydayup.designpattern.behavioural.strategy;

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
