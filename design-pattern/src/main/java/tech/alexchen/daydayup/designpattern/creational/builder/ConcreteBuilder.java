package tech.alexchen.daydayup.designpattern.creational.builder;

/**
 * ConcreteBuilder（具体建造者）：<br/>
 * 它实现了Builder接口，实现各个部件的具体构造和装配方法，
 * 定义并明确它所创建的复杂对象，也可以提供一个方法返回创建好的复杂产品对象。
 *
 * @author AlexChen
 * @date 2022-05-01 03:51
 */
public class ConcreteBuilder extends Builder {

    @Override
    public ConcreteBuilder buildProcessA() {
        //buildProcess
        return this;
    }

    @Override
    public ConcreteBuilder buildProcessB() {
        //buildProcess
        return this;
    }

    @Override
    public ConcreteBuilder buildProcessC() {
        //buildProcess
        return this;
    }

}
