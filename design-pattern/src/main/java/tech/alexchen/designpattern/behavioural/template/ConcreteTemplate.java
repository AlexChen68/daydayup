package tech.alexchen.designpattern.behavioural.template;

/**
 * @author alexchen
 * @date 2023/3/5
 */
public class ConcreteTemplate implements Operations {

    @Override
    public void execute() {
        System.out.println("template execute");
    }

}
