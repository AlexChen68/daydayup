package tech.alexchen.designpattern.behavioural.mediator;

/**
 * @author alexchen
 * @date 2023/3/6
 */
public class CoffeePot extends Colleague {
    public CoffeePot(Mediator mediator) {
        super(mediator);
    }

    public void doCoffeePot() {
        System.out.println("doCoffeePot()");
    }
}
