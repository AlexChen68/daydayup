package tech.alexchen.daydayup.designpattern.behavioural.chain;

/**
 * @author alexchen
 * @date 2023/3/5
 */
public class SecondHandler extends Handler {

    public SecondHandler(Handler successor) {
        super(successor);
    }

    @Override
    protected void handleRequest(Request request) {
        System.out.println("SecondHandler");
        successorHandleRequest(request);
    }
}
