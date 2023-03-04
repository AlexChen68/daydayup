package tech.alexchen.designpattern.structural.bridge;

import cn.hutool.core.util.StrUtil;

/**
 * @author alexchen
 * @date 2023/3/3
 */
public abstract class AbstractDriver implements Driver {

    @Override
    public Connection connection(String url) {
        if (StrUtil.containsAnyIgnoreCase(url, ConnectionType.LOADBALANCE_CONNECTION.getPrefix())) {
            return new LoadBalancedConnection();
        } else if (StrUtil.containsAnyIgnoreCase(url, ConnectionType.JDBC_CONNECTION.getPrefix())) {
            return new JdbcConnection();
        }
        return null;
    }
}
