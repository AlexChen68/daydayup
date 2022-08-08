package tech.alexchen.java.basic;

/**
 * 八个基本类型:
 * <p>
 * boolean/1
 * byte/8
 * char/16
 * short/16
 * int/32
 * float/32
 * long/64
 * double/64
 *
 * @author AlexChen
 * @date 2022-06-12 15:12
 */
public class DataTypeTest {

    public static void main(String[] args) {
        Integer a = 127;
        Integer b = 127;
        System.out.println(a == b);

        Integer c = 128;
        Integer d = 128;
        System.out.println(c == d);

        Integer x = new Integer(127);
        Integer y = new Integer(127);
        System.out.println(x == y);    // false
        Integer z = Integer.valueOf(127);
        Integer k = Integer.valueOf(127);
        System.out.println(z == k);   // true
    }
}
