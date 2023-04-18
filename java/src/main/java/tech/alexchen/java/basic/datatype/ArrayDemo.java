package tech.alexchen.java.basic.datatype;

/**
 * @author AlexChen
 * @date 2022-06-12 15:04
 */
public class ArrayDemo {

    public static void main(String[] args) {
        int[] arr1 = new int[0];
        int[] arr2 = {1, 2, 3};

        int[][] arr3 = new int[2][4];
        int[][] arr4 = {{1, 2}, {3, 4, 5, 6}};
        //行
        System.out.println(arr4.length);
        //列
        System.out.println(arr4[1].length);
    }
}
