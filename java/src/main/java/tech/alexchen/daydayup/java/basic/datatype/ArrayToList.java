package tech.alexchen.daydayup.java.basic.datatype;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @author alexchen
 */
public class ArrayToList {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        List<Integer> list1 = toListByForEach(arr);
        List<Integer> list2 = toListByStream(arr);
        System.out.println(list1);
        System.out.println(list2);
    }

    public static List<Integer> toListByForEach(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
        }
        return list;
    }

    /**
     * 数组类型必须是包装类型
     */
    public static List<Integer> toListByArrays(Integer[] arr) {
        return new ArrayList<>(Arrays.asList(arr));
    }

    public static List<Integer> toListByStream(int[] arr) {
        return Arrays.stream(arr).boxed().collect(Collectors.toList());
    }

    public static int[] toArray(List<Integer> list) {
        return list.stream().mapToInt(x -> x).toArray();
    }
}















