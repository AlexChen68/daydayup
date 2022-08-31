package tech.alexchen.spring.ioc;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import tech.alexchen.spring.ioc.bean.SysUser;

/**
 * @author AlexChen
 */
public class BeanExtensionTest {

   static AnnotationConfigApplicationContext context =
           new AnnotationConfigApplicationContext("tech.alexchen.spring.ioc.processor",
                   "tech.alexchen.spring.ioc.bean");

   @Test
   void processTest() {
      SysUser bean = context.getBean(SysUser.class);
   }

}
