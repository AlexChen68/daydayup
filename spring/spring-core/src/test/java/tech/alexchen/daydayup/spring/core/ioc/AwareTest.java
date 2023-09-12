package tech.alexchen.daydayup.spring.core.ioc;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import tech.alexchen.daydayup.spring.core.ioc.aware.CustomApplicationContextAware;

/**
 * @author alexchen
 */
public class AwareTest {

    @Test
    void test() {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("tech.alexchen.spring.core.ioc.aware");
        CustomApplicationContextAware bean = context.getBean(CustomApplicationContextAware.class);
        System.out.println(bean.getContext().hashCode());
    }
}
