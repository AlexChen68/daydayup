package tech.alexchen.designpattern.behavioural.template;

/**
 * @author alexchen
 * @date 2023/3/5
 */
public interface Operations {

    default void init() {
        System.out.println("default init");
    }

    void execute();

    default void destroy() {
        System.out.println("default destroy");
    }

    default void run() {
        init();
        execute();
        destroy();
    }
}
