package tech.alexchen.daydayup.designpattern.structural.adapter;

/**
 * Adaptee（适配者类）：<br/>
 * 适配者即被适配的角色，它定义了一个已经存在的接口，这个接口需要适配，适配者类一般是一个具体类，
 * 包含了客户希望使用的业务方法，在某些情况下可能没有适配者类的源代码。
 *
 * @author AlexChen
 * @date 2022-06-08 04:02
 */
public class Adaptee {

    public int[] quickSort(int[] array) {
        sort(array, 0, array.length - 1);
        return array;
    }

    public void sort(int[] array, int p, int r) {
        int q = 0;
        if (p < r) {
            q = partition(array, p, r);
            sort(array, p, q - 1);
            sort(array, q + 1, r);
        }
    }

    public int partition(int[] a, int p, int r) {
        int x = a[r];
        int j = p - 1;
        for (int i = p; i <= r - 1; i++) {
            if (a[i] <= x) {
                j++;
                swap(a, j, i);
            }
        }
        swap(a, j + 1, r);
        return j + 1;
    }

    public void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

}
