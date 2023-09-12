package tech.alexchen.daydayup.spring.core.aop;

import org.springframework.stereotype.Service;

/**
 * @author alexchen
 */
@Service
public class AopServiceImpl implements AopService{
    @Override
    public void doSth() {
        System.out.println("doSomething");
    }
}
