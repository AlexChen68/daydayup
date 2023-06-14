package tech.alexchen.daydayup.mysql.sharding.domain;

import lombok.Data;

/**
 * @author alexchen
 */
@Data
public class OrderConfig {

    /**
     * 编号
     */
    private Integer id;

    /**
     * 支付超时时间
     * 单位：分钟
     */
    private Integer payTimeout;
}
