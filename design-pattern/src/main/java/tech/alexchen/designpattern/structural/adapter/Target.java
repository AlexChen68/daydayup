package tech.alexchen.designpattern.structural.adapter;

import java.util.List;

/**
 * Target（目标抽象类）：<br/>
 * 目标抽象类定义客户所需接口，可以是一个抽象类或接口，也可以是具体类。
 *
 * @author AlexChen
 * @date 2022-06-08 04:01
 */
public interface Target {

    /**
     * 期待调用的方法
     *
     * @param array
     * @return int[]
     */
    int[] sortArray(int[] array);

    /**
     * 期待调用的方法
     *
     * @param list
     * @return
     */
    int[] sortList(List<Integer> list);

    /**
     * 其他方法
     */
    void anotherMethod();

}
