package tech.alexchen.spring.core.ioc.bean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @author alexchen
 */
@Component
public class TestFactoryBean implements FactoryBean {

    @Override
    public Object getObject() throws Exception {
        System.out.println("执行了 TestFactoryBean 的 getObject 方法");
        return new TestFactoryBean();
    }

    @Override
    public Class<?> getObjectType() {
        return TestFactoryBean.class;
    }

}
