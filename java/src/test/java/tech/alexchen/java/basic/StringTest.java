package tech.alexchen.java.basic;

import cn.hutool.core.util.StrUtil;
import org.junit.jupiter.api.Test;

/**
 * @author alexchen
 */
public class StringTest {

    /**
     * String 常量池测试
     */
    @Test
    void stringPool() {
        String s1 = "AB";

        String s2 = "A" + "B";

        String a = "A";
        String b = "B";
        String s3 = a + b;

        System.out.println(StrUtil.format("s1 == s2  {}", s1 == s2)); // true
        System.out.println(StrUtil.format("s1 == s3  {}", s1 == s3)); // true
    }
}
