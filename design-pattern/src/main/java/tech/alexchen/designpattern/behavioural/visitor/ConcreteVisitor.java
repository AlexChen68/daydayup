package tech.alexchen.designpattern.behavioural.visitor;

/**
 * @author alexchen
 * @date 2023/3/5
 */
public class ConcreteVisitor implements Visitor {

    @Override
    public void visit(Order order) {
        System.out.println("order: " + order.getInfo());
    }

    @Override
    public void visit(Item item) {
        System.out.println("item: " + item.getInfo());
    }
}
