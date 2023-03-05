package tech.alexchen.designpattern.behavioural.iterator;

import java.sql.Array;
import java.util.ArrayList;

/**
 * @author alexchen
 * @date 2023/3/5
 */
public class Client {

    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, 3, 5, 7, 9};
        ConcreteAggregate aggregate = new ConcreteAggregate(array);
        Iterator iterator = aggregate.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
