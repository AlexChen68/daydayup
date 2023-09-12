package tech.alexchen.daydayup.designpattern.structural.composite;

/**
 * @author alexchen
 * @date 2023/3/4
 */
public class Leaf extends Component {
    @Override
    public void add(Component c) {
        //异常处理或错误提示
    }

    @Override
    public void remove(Component c) {
        //异常处理或错误提示
    }

    @Override
    public Component getChild(int i) {
        //异常处理或错误提示
        return null;
    }

    @Override
    public void operation() {
        //叶子构件具体业务方法的实现
    }
}
