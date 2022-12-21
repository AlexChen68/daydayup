package tech.alexchen.spring.core.ioc.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * BeanFactoryPostProcessor 可以在容器实例化任何 Bean 之前，读取和修改配置元数据
 *
 * @author AlexChen
 */
@Component
@Scope
public class CustomBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        BeanDefinition beanDefinition = configurableListableBeanFactory.getBeanDefinition("sysUser");
        System.out.println("Bean's name:" + beanDefinition.getBeanClassName());
    }
}
