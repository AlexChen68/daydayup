package tech.alexchen.algorithm.linear;

/**
 * 线性表
 *
 * @author AlexChen
 */
public interface LinearList<E> {

    /**
     * 获取大小
     * @return
     */
    int size();

    /**
     * 是否为空
     * @return
     */
    boolean isEmpty();

    /**
     * 是否包含
     * @param o
     * @return
     */
    boolean contains(Object o);

    /**
     * 添加元素
     *
     * @param e
     * @return
     */
    boolean add(E e);

    /**
     * 删除元素
     * @param o
     * @return
     */
    boolean remove(Object o);

    /**
     * 清空线性表
     */
    void clear();

}
