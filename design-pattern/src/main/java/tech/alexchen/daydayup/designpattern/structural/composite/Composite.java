package tech.alexchen.daydayup.designpattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author alexchen
 * @date 2023/3/4
 */
public class Composite extends Component {

    private List<Component> list = new ArrayList<>();

    @Override
    public void add(Component c) {
        list.add(c);
    }

    @Override
    public void remove(Component c) {
        list.remove(c);
    }

    @Override
    public Component getChild(int i) {
        return (Component) list.get(i);
    }

    @Override
    public void operation() {
        //容器构件具体业务方法的实现
        //递归调用成员构件的业务方法
        for (Object obj : list) {
            ((Component) obj).operation();
        }
    }
}

