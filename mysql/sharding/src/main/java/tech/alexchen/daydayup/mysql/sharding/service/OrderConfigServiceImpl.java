package tech.alexchen.daydayup.mysql.sharding.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import tech.alexchen.daydayup.mysql.sharding.domain.OrderConfig;
import tech.alexchen.daydayup.mysql.sharding.mapper.OrderConfigMapper;

/**
 * @author alexchen
 */
@Service
public class OrderConfigServiceImpl extends ServiceImpl<OrderConfigMapper, OrderConfig> implements OrderConfigService {

}
