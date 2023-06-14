package tech.alexchen.daydayup.mysql.sharding.service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import tech.alexchen.daydayup.mysql.sharding.ShardingApplication;

import javax.annotation.Resource;

/**
 * @author alexchen
 */
@SpringBootTest(classes = ShardingApplication.class)
public class OrderConfigServiceTest {

    @Resource
    private OrderConfigService orderConfigService;

    @Test
    void queryByUserId() {
        orderConfigService.getById(1);
    }
}