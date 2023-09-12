package tech.alexchen.daydayup.designpattern.structural.adapter;

/**
 * 默认适配器：<br/>
 * 当不需要实现一个接口所提供的所有方法时，可先设计一个抽象类实现该接口，并为接口中每个方法提供一个默认实现（空方法），
 * 那么该抽象类的子类可以选择性地覆盖父类的某些方法来实现需求，它适用于不想使用一个接口中的所有方法的情况，又称为单接口适配器模式。
 *
 * @author AlexChen
 * @date 2022-06-08 04:34
 */
public abstract class AbstractAdapter implements Target {

    protected Adaptee adaptee;

    public AbstractAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public int[] sortArray(int[] array) {
        return adaptee.quickSort(array);
    }

    @Override
    public void anotherMethod() {
        //默认适配器的作用就是可以对不需要适配的方法进行空实现，防止每个适配器都需要实现全部方法
    }

}
