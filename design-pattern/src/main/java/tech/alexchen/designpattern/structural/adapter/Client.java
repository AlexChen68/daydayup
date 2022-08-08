package tech.alexchen.designpattern.structural.adapter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author AlexChen
 * @date 2022-06-08 04:08
 */
public class Client {

    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Adapter adapter = new Adapter(adaptee);
        int[] array = new int[]{1, 2, 6, 277, 683, 26, 88, 11, 83};
        int[] sort = adapter.sortArray(array);
        for (int i : sort) {
            System.out.printf(i + " ");
        }

        System.out.println();

        array[0] = 19;
        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
        int[] ints = adapter.sortList(list);
        for (int i : ints) {
            System.out.printf(i + " ");
        }
    }
}
