package tech.alexchen.spring.ioc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import tech.alexchen.spring.ioc.bean.SysDept;
import tech.alexchen.spring.ioc.bean.SysUser;
import tech.alexchen.spring.ioc.bean.SysUserDaoImpl;
import tech.alexchen.spring.ioc.bean.SysUserServiceImpl;

/**
 * Spring 配置 Bean 的方式二： java 代码配置
 *
 * @author alexchen
 */
@EnableAspectJAutoProxy
@Configuration
public class BeansConfig {

    @Bean
    public SysUser user() {
        return new SysUser();
    }

    @Bean
    public SysDept dept() {
        return new SysDept();
    }

    @Bean("userDao")
    public SysUserDaoImpl userDao() {
        return new SysUserDaoImpl();
    }

    @Bean("userService")
    public SysUserServiceImpl sysUserService() {
        SysUserServiceImpl userService = new SysUserServiceImpl();
        // 通过 setter 注入
        userService.setUserDao(userDao());
        return userService;
    }

}
