package tech.alexchen.designpattern.structural.facade;

/**
 * @author alexchen
 * @date 2023/3/3
 */
public class SubSystem {

    public void turnOnTV() {
        System.out.println("turnOnTV()");
    }

    public void setCD(String cd) {
        System.out.println("setCD( " + cd + " )");
    }

    public void starWatching(){
        System.out.println("starWatching()");
    }
}
