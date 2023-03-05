package tech.alexchen.designpattern.behavioural.iterator;

/**
 * @author alexchen
 * @date 2023/3/5
 */
public interface Aggregate {

    Iterator createIterator();
}
