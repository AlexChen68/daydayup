package tech.alexchen.daydayup.designpattern.structural.facade;

/**
 * @author alexchen
 * @date 2023/3/3
 */
public class Facade extends AbstractFacade {

    private SubSystem subSystem = new SubSystem();
    @Override
    void watchMovie() {
        subSystem.turnOnTV();
        subSystem.setCD("a movie");
        subSystem.starWatching();
    }
}
