package tech.alexchen.designpattern.behavioural.visitor;

/**
 * @author alexchen
 * @date 2023/3/5
 */
public class Client {

    public static void main(String[] args) {
        Visitor visitor = new ConcreteVisitor();
        Order order = new Order("order_a");
        order.addItem(new Item("item_a1"));
        order.addItem(new Item("item_a2"));
        order.addItem(new Item("item_a3"));

        order.accept(visitor);
    }
}
