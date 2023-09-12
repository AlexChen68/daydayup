package tech.alexchen.daydayup.designpattern.behavioural.memento;

/**
 * @author alexchen
 * @date 2023/3/6
 */
public class Client {

    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator("java");
        caretaker.saveMemento("1", originator.backup());
        System.out.println(originator.getState());

        originator.setState("python");
        caretaker.saveMemento("2", originator.backup());
        System.out.println(originator.getState());

        originator.setState("go");
        System.out.println(originator.getState());

        originator.restore(caretaker.getMemento("1"));
        System.out.println(originator.getState());
    }
}
