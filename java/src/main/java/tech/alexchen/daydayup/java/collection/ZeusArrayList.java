package tech.alexchen.daydayup.java.collection;

import java.util.*;

/**
 * @author alexchen
 * @date 2022/6/24
 */
public class ZeusArrayList<E> extends AbstractList<E>
        implements List<E>, RandomAccess, Cloneable, java.io.Serializable{

    /**
     * 列表大小
     */
    private int size;
    /**
     * 列表元素数组
     */
    transient Object[] elementData;
    /**
     * 默认大小
     */
    private static final int DEFAULT_CAPACITY = 10;
    /**
     * 用于空实例的共享空数组实例。
     */
    private static final Object[] EMPTY_ELEMENTDATA = {};
    /**
     * 用于默认大小的空实例的共享空数组实例。
     * 我们将其与 EMPTY_ELEMENTDATA 区分开来，以了解添加第一个元素时要膨胀多少。
     */
    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};

    /**
     * 无参构造，由于未指定列表长度，使用默认的空数组
     */
    public ZeusArrayList() {
        this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
    }

    /**
     * 指定列表长度的构造方法
     *
     * @param initialCapacity
     */
    public ZeusArrayList(int initialCapacity) {
        if (initialCapacity > 0) {
            //大于0，创建一个 Object 对象数组
            this.elementData = new Object[initialCapacity];
        } else if (initialCapacity == 0) {
            //数组为空时，使用空实例的共享空数组实例
            this.elementData = EMPTY_ELEMENTDATA;
        } else {
            throw new IllegalArgumentException("Illegal Capacity: "+ initialCapacity);
        }
    }

    /**
     * 使用已有集合构造数组列表
     *
     * @param collection
     */
    public ZeusArrayList(Collection<? extends E> collection) {
        Object[] a = collection.toArray();
        size = a.length;
        if (size != 0) {
            //集合参数为数组列表，直接赋值
            if (collection.getClass() == ZeusArrayList.class) {
                elementData = a;
            } else {
                //集合参数非数组列表，使用数组工具转化为
                elementData = Arrays.copyOf(a, size, Object[].class);
            }
        } else {
            elementData = EMPTY_ELEMENTDATA;
        }
    }

    /**
     * 修剪当前列表中数组长度为容器的大小
     */
    public void trimToSize() {
        // 继承自 AbstractArrayList，此列表在结构上被修改的次数。结构修改是那些改变列表大小的修改，
        // 或者以其他方式扰乱它，使得正在进行的迭代可能产生不正确的结果。
        // 该字段由 iterator 和 listIterator 方法返回的迭代器和列表迭代器实现使用。
        modCount++;
        if (size < elementData.length) {
            elementData = (size == 0)
                    ? EMPTY_ELEMENTDATA
                    : Arrays.copyOf(elementData, size);
        }
    }

    /**
     * 如有必要，增加此 ArrayList 实例的容量，以确保它至少可以容纳最小容量参数指定的元素数量。
     */
    public void ensureCapacity(int minCapacity) {
        //最小扩容量，不是默认容器，则为 0
        int minExpand = (elementData != DEFAULTCAPACITY_EMPTY_ELEMENTDATA) ? 0 : DEFAULT_CAPACITY;
        if (minCapacity > minExpand) {
            // 指定容器大于最小扩容量，则扩容至指定容量
//            ensureExplicitCapacity(minCapacity);
        }
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
