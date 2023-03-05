package tech.alexchen.designpattern.behavioural.state;

/**
 * @author alexchen
 * @date 2023/3/5
 */
public class Client {

    public static void main(String[] args) {
        Switch s = new Switch("lamp");
        s.on();
        s.on();
        s.off();
        s.off();
    }
}
