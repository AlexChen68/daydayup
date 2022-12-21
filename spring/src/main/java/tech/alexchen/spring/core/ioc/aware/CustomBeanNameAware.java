package tech.alexchen.spring.core.ioc.aware;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

/**
 * 让 Bean 可以从容器获取 Bean 的唯一名称
 *
 * @author AlexChen
 */
@Component
public class CustomBeanNameAware implements BeanNameAware {

    @Override
    public void setBeanName(String s) {
        System.out.println("BeanName:" + s);
    }
}
