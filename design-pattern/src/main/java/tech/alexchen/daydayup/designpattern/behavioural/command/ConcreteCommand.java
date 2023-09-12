package tech.alexchen.daydayup.designpattern.behavioural.command;

/**
 * @author alexchen
 * @date 2023/3/5
 */
public class ConcreteCommand implements Command {

    // 请求的接收者
    Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        // 接收者的业务操作
        receiver.action();
    }
}
