package tech.alexchen.daydayup.spring.core.ioc.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.Lifecycle;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author AlexChen
 */
@Component
public class LifeCycleBean implements InitializingBean, DisposableBean, Lifecycle {

    @PostConstruct
    public void postConstruct() {
        System.out.println("@PostConstruct");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean.afterPropertiesSet()");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("@PreDestroy");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean.destroy()");
    }

    // interface Lifecycle

    @Override
    public void start() {
        System.out.println("Lifecycle.start");
    }

    @Override
    public void stop() {
        System.out.println("Lifecycle.stop");
    }

    @Override
    public boolean isRunning() {
        System.out.println("Lifecycle.isRunning");
        return false;
    }

    public void doSomeThing() {
        System.out.println("-------------------");
    }

}
