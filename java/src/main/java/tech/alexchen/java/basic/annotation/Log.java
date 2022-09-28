package tech.alexchen.java.basic.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * 定义一个 log 注解
 * @author alexchen
 */
@Target({ElementType.ANNOTATION_TYPE})
public @interface Log {


}
