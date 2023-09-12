package tech.alexchen.daydayup.mysql.slave.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author alexchen
 */
@Data
@TableName("orders")
public class Order {

    /**
     * 订单编号
     */
    private Long id;
    /**
     * 用户编号
     */
    private Integer userId;
}
