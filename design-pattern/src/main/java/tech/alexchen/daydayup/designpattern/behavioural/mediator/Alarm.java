package tech.alexchen.daydayup.designpattern.behavioural.mediator;

/**
 * @author alexchen
 * @date 2023/3/6
 */
public class Alarm extends  Colleague {

    public Alarm(Mediator mediator) {
        super(mediator);
    }

    public void doAlarm() {
        System.out.println("doAlarm()");
    }
}
