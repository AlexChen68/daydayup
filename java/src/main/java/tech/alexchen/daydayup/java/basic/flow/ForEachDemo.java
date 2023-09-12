package tech.alexchen.daydayup.java.basic.flow;

/**
 * @author alexchen
 * @date 2023/2/25
 */
public class ForEachDemo {

    public static void main(String args) {
        String[] strings = {"java", "python", "go"};

        for (String str : strings) {
            System.out.println(str);
        }
    }

}
