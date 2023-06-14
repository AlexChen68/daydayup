package tech.alexchen.daydayup.mysql.sharding.service;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import tech.alexchen.daydayup.mysql.sharding.domain.Order;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author alexchen
 */
@SpringBootTest
public class OrderServiceTest {

    @Resource
    private OrderService service;

    @Test
    void query() {
        Order order = service.getById(1);
        System.out.println(order);
    }

    @Test
    void queryByUserId() {
        List<Order> list = service.list(Wrappers.<Order>lambdaQuery()
                .eq(Order::getUserId, 6));
        System.out.println(list.size());
    }

    @Test
    void insert() {
        List<Order> list = new ArrayList<Order>();
        for (int i = 0; i < 80; i++) {
            Order order = new Order();
            order.setUserId(i);
            list.add(order);
        }
        Assertions.assertTrue(service.saveBatch(list));
    }
}