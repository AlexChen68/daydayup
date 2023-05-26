package tech.alexchen.mybatis.spring.mapper;

import cn.hutool.json.JSONUtil;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import tech.alexchen.mybatis.spring.entity.SysUser;
import tech.alexchen.mybatis.spring.service.SysUserService;

/**
 * @author alexchen
 */
class UserMapperTest {

    private static String BASE_PACKAGES = "tech.alexchen.mybatis.spring";

    @Test
    void sqlSessionTest() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BASE_PACKAGES);
        SqlSessionTemplate sqlSession = context.getBean("sqlSession", SqlSessionTemplate.class);
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        SysUser user = userMapper.getUser(1);
        System.out.println(JSONUtil.toJsonStr(user));
    }

    @Test
    void userServiceTest() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BASE_PACKAGES);
        SysUserService userService = context.getBean(SysUserService.class);
        SysUser user = userService.getUser(1);
        System.out.println(JSONUtil.toJsonStr(user));
    }

    @Test
    void userMapper() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BASE_PACKAGES);
        // 直接从容器中获取 UserMapper
        UserMapper userMapper = context.getBean(UserMapper.class);
        System.out.println(JSONUtil.toJsonStr(userMapper.getUser(1)));
    }


    @Test
    void transactionTest() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BASE_PACKAGES);
        SysUserService userService = context.getBean(SysUserService.class);
        userService.addAndDelete();
    }
}