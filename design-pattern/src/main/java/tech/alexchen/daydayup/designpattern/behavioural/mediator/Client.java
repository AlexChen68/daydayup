package tech.alexchen.daydayup.designpattern.behavioural.mediator;

/**
 * @author alexchen
 * @date 2023/3/6
 */
public class Client {

    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        Alarm alarm = new Alarm(mediator);
        CoffeePot coffeePot = new CoffeePot(mediator);

        mediator.register(coffeePot);
        alarm.onEvent("alarm: ding ding ding!");
    }
}
