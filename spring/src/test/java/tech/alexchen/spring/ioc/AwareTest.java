package tech.alexchen.spring.ioc;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import tech.alexchen.spring.ioc.aware.CustomApplicationContextAware;

/**
 * @author alexchen
 */
public class AwareTest {

    @Test
    void test() {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("tech.alexchen.spring.ioc.aware");
        CustomApplicationContextAware bean = context.getBean(CustomApplicationContextAware.class);
        System.out.println(bean.getContext().hashCode());
    }
}
