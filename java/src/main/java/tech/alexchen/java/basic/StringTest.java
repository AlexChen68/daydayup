package tech.alexchen.java.basic;

/**
 * @author AlexChen
 * @date 2022-06-12 14:22
 */
public class StringTest {

    public static void main(String[] args) {


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
}
