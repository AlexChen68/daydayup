package tech.alexchen.designpattern.behavioural.template;

/**
 * @author alexchen
 * @date 2023/3/5
 */
public class Client {

    public static void main(String[] args) {
        ConcreteTemplate template = new ConcreteTemplate();
        template.run();
    }
}
