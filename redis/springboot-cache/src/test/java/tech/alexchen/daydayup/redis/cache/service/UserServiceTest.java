package tech.alexchen.daydayup.redis.cache.service;

import cn.hutool.json.JSONUtil;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import tech.alexchen.daydayup.redis.cache.SpringBootCacheApplication;
import tech.alexchen.daydayup.redis.cache.entity.User;

import javax.annotation.Resource;

/**
 * @author alexchen
 */
@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = SpringBootCacheApplication.class)
class UserServiceTest {

    @Resource
    UserService userService;

    @Test
    void saveUser() {
        User user = User.builder()
                .id(1L)
                .name("alex")
                .age(25)
                .phone("18342212760")
                .build();
        userService.saveUser(user);
        // 查询，缓存
        getById();
        // 再查询，走缓存
        getById();
    }

    @Test
    void updateUser() {
        User user = User.builder()
                .id(1L)
                .name("alexchen")
                .age(18)
                .phone("18342212760")
                .build();
        userService.updateUser(user);
        // 查询，缓存
        getById();
        // 再查询，走缓存
        getById();
    }

    void getById() {
        User user = userService.getById(1L);
        System.out.println(JSONUtil.toJsonStr(user));
    }

    @Test
    void removeUser() {
        userService.removeUser(1L);
        // 设置了不缓存 null
        getById();
    }
}