package tech.alexchen.daydayup.designpattern.behavioural.mediator;

/**
 * @author alexchen
 * @date 2023/3/6
 */
public class ConcreteMediator extends Mediator {
    @Override
    public void operation(String info) {
        System.out.println("Colleague got info: " + info);
        for (Colleague colleague : colleagues) {
            if (colleague instanceof Alarm) {
                Alarm alarm = (Alarm) colleague;
                alarm.doAlarm();
            } else if (colleague instanceof CoffeePot) {
                CoffeePot coffeePot = (CoffeePot) colleague;
                coffeePot.doCoffeePot();
            }
        }

    }
}
