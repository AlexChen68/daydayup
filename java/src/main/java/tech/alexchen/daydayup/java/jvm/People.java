package tech.alexchen.daydayup.java.jvm;

/**
 * @author alexchen
 */
public class People {

    public static void main(String[] args) {
        People people = new People();
        System.out.println(people.getClass().getClassLoader());
    }
}
