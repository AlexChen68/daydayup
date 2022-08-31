package tech.alexchen.designpattern.structural.proxy;

/**
 * @author alexchen
 */
public class RealSubject implements Subject{

    public void operation() {
        System.out.println("RealSubject.operation()");
    }
}
