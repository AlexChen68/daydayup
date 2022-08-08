package tech.alexchen.designpattern.structural.adapter;

import java.util.List;

/**
 * Adapter（适配器类）：<br/>
 * 适配器可以调用另一个接口，作为一个转换器，对Adaptee和Target进行适配，适配器类是适配器模式的核心，
 * 在对象适配器中，它通过继承Target并关联一个Adaptee对象使二者产生联系。
 *
 * @author AlexChen
 * @date 2022-06-08 02:56
 */
public class Adapter extends DefaultAdapter {

    public Adapter(Adaptee adaptee) {
        super(adaptee);
    }

    @Override
    public int[] sortList(List<Integer> list) {
        int[] ints = list.stream().mapToInt(Integer::valueOf).toArray();
        return adaptee.quickSort(ints);
    }
}
