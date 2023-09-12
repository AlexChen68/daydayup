package tech.alexchen.daydayup.spring.core.ioc;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tech.alexchen.daydayup.spring.core.ioc.bean.SysUser;
import tech.alexchen.daydayup.spring.core.ioc.config.BeansConfig;
import tech.alexchen.daydayup.spring.core.ioc.bean.SysUserService;

import java.util.List;

/**
 * @author alexchen
 */
class IocTest {

    /**
     * 从 xml 文件读取配置
     */
    @Test
    void xmlConfig() {
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc.xml");
        SysUserService userService = context.getBean("userService", SysUserService.class);
        List<SysUser> userList = userService.findUserList();
        userList.forEach(a ->
                System.out.println(a.getUsername())
        );
    }

    /**
     * 从 java 配置类中读取配置
     */
    @Test
    void javaConfig() {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(BeansConfig.class);
        SysUserService userService = context.getBean("userService", SysUserService.class);
        List<SysUser> userList = userService.findUserList();
        userList.forEach(a ->
                System.out.println(a.getUsername())
        );
    }

    /**
     * 在类上添加注解，通过扫描包加载配置
     */
    @Test
    void annotationConfig() {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("tech.alexchen.spring.core.ioc.bean");
        SysUserService userService = context.getBean("userService", SysUserService.class);
        List<SysUser> userList = userService.findUserList();
        userList.forEach(a ->
                System.out.println(a.getUsername())
        );
    }

}