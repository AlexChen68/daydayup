package tech.alexchen.daydayup.designpattern.behavioural.chain;

/**
 * @author alexchen
 * @date 2023/3/5
 */
public class Client {
    public static void main(String[] args) {
        SecondHandler secondHandler = new SecondHandler(null);
        FirstHandler firstHandler = new FirstHandler(secondHandler);

        firstHandler.handleRequest(new Request());
    }
}
