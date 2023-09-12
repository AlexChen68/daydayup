package tech.alexchen.daydayup.designpattern.behavioural.iterator;

/**
 * @author alexchen
 * @date 2023/3/5
 */
public class ConcreteIterator<T> implements Iterator<T> {

    private T[] items;
    private int position = 0;

    public ConcreteIterator(T[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.length;
    }

    @Override
    public T next() {
        return items[position++];
    }
}
