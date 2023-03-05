package tech.alexchen.designpattern.behavioural.iterator;

/**
 * @author alexchen
 * @date 2023/3/5
 */
public class ConcreteAggregate implements Aggregate {

    private Integer[] items;

    public ConcreteAggregate(Integer[] items) {
        this.items = items;
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator<Integer>(items);
    }
}
