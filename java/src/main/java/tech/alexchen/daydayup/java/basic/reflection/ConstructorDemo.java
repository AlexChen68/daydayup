package tech.alexchen.daydayup.java.basic.reflection;

import java.lang.reflect.Constructor;

/**
 * @author alexchen
 */
public class ConstructorDemo {

    public static void main(String[] args) throws Exception {
        Class<People> clazz = People.class;
        // 获取公开的无参构造方法
        Constructor<People> constructor = clazz.getConstructor();
        // 获取访问权限是 public 的构造方法数组
        Constructor<?>[] constructors = clazz.getConstructors();
        // 获取全部的构造方法数组
        Constructor<?>[] declaredConstructors = clazz.getDeclaredConstructors();

        // 构造实例
        constructor.setAccessible(true);
        People people = constructor.newInstance();
    }
}
