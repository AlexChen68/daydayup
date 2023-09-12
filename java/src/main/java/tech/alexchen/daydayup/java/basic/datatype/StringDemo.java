package tech.alexchen.daydayup.java.basic.datatype;

import cn.hutool.core.util.StrUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * @author AlexChen
 * @date 2022-06-12 14:22
 */
public class StringDemo {
    public static void main(String[] args) {
        firstUniqChar("leetcode");
    }

    public static void stringPool() {
        // StringPool
        String s1 = "AB";
        String s2 = "A" + "B";
        String a = "A";
        String b = "B";
        String s22 = a + b;
        System.out.println(StrUtil.format("s1 == s2  {}", s1 == s2)); // true
        System.out.println(StrUtil.format("s1 == s22  {}", s1 == s22)); // true

        // new String 得到的是 "AB" 的副本
        String s3 = new String("AB");
        String s33 = new String("AB");
        System.out.println(StrUtil.format("s3 == s33  {}", s3 == s33)); // false

        System.out.println(s1 == s3); // false
    }

    public static void stringMethod() {
        String str = "Hello";
        System.out.println(str.equals("hello"));
        str = str.concat(" World");
        System.out.println(str);
        System.out.println(str.toLowerCase().startsWith("hello"));
        System.out.println(str.toLowerCase().endsWith("world"));
        System.out.println(str.indexOf("o", 5));
        System.out.println(str.substring(2, 8));
        System.out.println(str.replace("World", "java"));
    }

    public static void stringBufferAndStringBuilder() {
        StringBuilder stringBuilder = new StringBuilder("hello world");
    }

    public static int firstUniqChar(String s) {
        Map<Character, Integer> count = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            count.put(ch, count.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (count.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
