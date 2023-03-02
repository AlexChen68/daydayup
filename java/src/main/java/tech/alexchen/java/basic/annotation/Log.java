package tech.alexchen.java.basic.annotation;

import java.lang.annotation.*;

/**
 * 定义一个 log 注解
 * @author alexchen
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Log {

    /**
     * 描述
     * @return {String}
     */
    String value() default "";

    /**
     * spel 表达式
     * @return 日志描述
     */
    String expression() default "";
}
