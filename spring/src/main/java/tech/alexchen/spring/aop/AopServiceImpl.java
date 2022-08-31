package tech.alexchen.spring.aop;

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
