package tech.alexchen.daydayup.mysql.slave.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import tech.alexchen.daydayup.mysql.slave.SlaveApplication;
import tech.alexchen.daydayup.mysql.slave.domain.Order;

import javax.annotation.Resource;

import java.util.ArrayList;
import java.util.List;

/**
 * @author alexchen
 */
@SpringBootTest(classes = SlaveApplication.class)
public class OrderServiceTest {

    @Resource
    private OrderService service;

    @Test
    void insert() {
        List<Order> orders = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Order order = new Order();
            order.setUserId(i);
            orders.add(order);
        }
        Assertions.assertTrue(service.saveBatch(orders));
    }

    @Test
    void query() {
        List<Order> list = service.list();
        System.out.println(list);
    }
}