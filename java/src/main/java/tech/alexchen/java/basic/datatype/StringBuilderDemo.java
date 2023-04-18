package tech.alexchen.java.basic.datatype;

/**
 * @author alexchen
 * @date 2023/2/25
 */
public class StringBuilderDemo {

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("hello ");
        builder.append("world");
        String str = builder.toString();
        System.out.printf(str);
    }
}
