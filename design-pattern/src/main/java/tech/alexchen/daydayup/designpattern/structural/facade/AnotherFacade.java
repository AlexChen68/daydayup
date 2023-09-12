package tech.alexchen.daydayup.designpattern.structural.facade;

/**
 * @author alexchen
 * @date 2023/3/3
 */
public class AnotherFacade extends AbstractFacade{

    private AnotherSubSystem anotherSubSystem = new AnotherSubSystem();
    @Override
    void watchMovie() {
        anotherSubSystem.play();
    }
}
