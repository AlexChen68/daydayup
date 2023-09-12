package tech.alexchen.daydayup.spring.core.ioc;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import tech.alexchen.daydayup.spring.core.ioc.bean.SysUser;

/**
 * @author AlexChen
 */
public class BeanExtensionTest {

   static AnnotationConfigApplicationContext context =
           new AnnotationConfigApplicationContext("tech.alexchen.spring.core.ioc.processor",
                   "tech.alexchen.spring.core.ioc.bean");

   @Test
   void processTest() {
      SysUser bean = context.getBean(SysUser.class);
   }

}
