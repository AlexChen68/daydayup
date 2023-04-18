package tech.alexchen.java.basic.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * @author alexchen
 */
public class FieldDemo {

    public static void main(String[] args) throws Exception {
        Class<People> clazz = People.class;
        // 获取 public 的属性
        Field[] publicFields = clazz.getFields();
        // 获取所有属性
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("Nonpublic Filed name: " + field.getName());
        }
        // 获取指定名称的 public 属性
        Field infoField = clazz.getField("info");
        System.out.println(infoField.getName());
        // 获取指定名称的属性
        Field nameField = clazz.getDeclaredField("name");
        System.out.println(nameField.getName());

        // 获取实例
        Constructor<People> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        People people = constructor.newInstance();
        nameField.setAccessible(true);
        nameField.set(people, "zhangsan");

        System.out.println(people.getName());
    }
}
