package tech.alexchen.daydayup.designpattern.behavioural.chain;

/**
 * @author alexchen
 * @date 2023/3/5
 */
public abstract class Handler {
    // 持有下一个处理者的引用
    protected Handler successor;

    public Handler(Handler successor) {
        this.successor = successor;
    }

    protected abstract void handleRequest(Request request);

    protected void successorHandleRequest(Request request) {
        if (successor != null) {
            successor.handleRequest(request);
        }
    }
}
