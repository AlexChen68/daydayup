package tech.alexchen.daydayup.designpattern.behavioural.visitor;

/**
 * 访问者针对不同类型的元素，由不同的访问方式
 *
 * @author alexchen
 * @date 2023/3/5
 */
public interface Visitor {

    void visit(Order order);

    void visit(Item item);
}
