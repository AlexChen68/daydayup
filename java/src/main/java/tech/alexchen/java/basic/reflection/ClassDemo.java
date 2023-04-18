package tech.alexchen.java.basic.reflection;

/**
 * @author alexchen
 */
public class ClassDemo {

    public static void main(String[] args) throws ClassNotFoundException {
        // 方式一
        Class<ClassDemo> clazz1 = ClassDemo.class;

        // 方式二
        ClassDemo demo = new ClassDemo();
        Class<? extends ClassDemo> clazz2 = demo.getClass();

        // 方式三
        Class<?> clazz3 = Class.forName("tech.alexchen.java.basic.reflection.ClassDemo");
    }
}
