package tech.alexchen.daydayup.designpattern.creational.prototype;

import java.io.Serializable;

/**
 * 声明克隆方法的接口，是所有具体原型类的公共父类，可以为抽象类也可以是接口，甚至还可以是具体实现类。
 *
 * @author AlexChen
 * @date 2022-06-07 06:04
 */
public interface Prototype extends Cloneable, Serializable {

    /**
     * 浅克隆方法
     *
     * @return 新的原型对象
     */
    Prototype shallowClone();


    /**
     * 深克隆方法
     *
     * @return Prototype 新的原型对象
     * @throws Exception
     */
    Prototype deepClone() throws Exception;
}
