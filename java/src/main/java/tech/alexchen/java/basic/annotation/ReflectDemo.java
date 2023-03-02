package tech.alexchen.java.basic.annotation;

import java.lang.reflect.Method;

/**
 * 通过反射获取注解信息
 *
 * @author alexchen
 * @date 2023/2/25
 */
public class ReflectDemo {

    @Log(value = "反射测试")
    public void annotationTest() {
        //
    }
    public static void main(String[] args) throws NoSuchMethodException {
        // 获取 Class 对象
        Class<ReflectDemo> serviceClass = ReflectDemo.class;
        // 获取 Method 对象
        Method method = serviceClass.getMethod("annotationTest");
        // 获取 Log 注解对象
        Log annotation = method.getAnnotation(Log.class);
        System.out.println(annotation.value());
    }
}
