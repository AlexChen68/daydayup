package tech.alexchen.designpattern.structural.facade;

/**
 * @author alexchen
 * @date 2023/3/3
 */
public class Client {

    public static void main(String[] args) {
        // 根据情况选择需要的门面
        AbstractFacade facade = new Facade();
//        AbstractFacade facade = new AnotherFacade();
        facade.watchMovie();
    }
}
