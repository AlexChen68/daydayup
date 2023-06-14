package tech.alexchen.daydayup.mysql.sharding.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import tech.alexchen.daydayup.mysql.sharding.domain.Order;
import tech.alexchen.daydayup.mysql.sharding.mapper.OrderMapper;

/**
 * @author alexchen
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {


}
