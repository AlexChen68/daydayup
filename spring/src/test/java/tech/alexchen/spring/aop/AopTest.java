package tech.alexchen.spring.aop;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author alexchen
 */
class AopTest {

    @Test
    void logTest() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
        AopService service = context.getBean(AopService.class);
        service.doSth();
    }
}