package tech.alexchen.daydayup.java.basic;

import org.junit.jupiter.api.Test;

/**
 * @author alexchen
 */
public class DataTypeTest {

    /**
     * 缓存池
     */
    @Test
    void cachePool() {
        Integer a = 127;
        Integer b = 127;
        System.out.println(a == b); // true

        Integer c = 128;
        Integer d = 128;
        System.out.println(c == d); // false

        Integer x = new Integer(127);
        Integer y = new Integer(127);
        System.out.println(x == y);    // false

        Integer z = Integer.valueOf(127);
        Integer k = Integer.valueOf(127);
        System.out.println(z == k);   // true
    }

    /**
     *  int 转 char
     */
    @Test
    void intToChar() {
        int a = 6500;
        System.out.println((char)a);
    }

    /**
     * char 转 int
     */
    @Test
    void charToInt() {
        // 自动使用 A 的 ASCII 赋值给 a
        int a = 'A';
        System.out.println(a);
    }
}
