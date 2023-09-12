package tech.alexchen.daydayup.spring.core.ioc;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import tech.alexchen.daydayup.spring.core.ioc.lifecycle.LifeCycleBean;

/**
 * @author AlexChen
 */
class LifeCycleBeanTest {

    @Test
    void lifeCycle() {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("tech.alexchen.spring.core.ioc.lifecycle");
        context.start();
        LifeCycleBean lifeCycleBean = context.getBean(LifeCycleBean.class);
        lifeCycleBean.doSomeThing();
        context.stop();
        context.close();
    }
}