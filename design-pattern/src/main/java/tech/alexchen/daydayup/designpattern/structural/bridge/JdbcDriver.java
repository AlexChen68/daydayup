package tech.alexchen.daydayup.designpattern.structural.bridge;

import cn.hutool.core.util.StrUtil;

import java.sql.SQLException;

/**
 * @author alexchen
 * @date 2023/3/3
 */
public class JdbcDriver extends AbstractDriver {

//    static {
//        DriverManager.registerDriver(new JdbcDriver());
//    }

    @Override
    public boolean acceptsURL(String url) throws SQLException {
        System.out.println("JdbcDriver");
        return StrUtil.containsAnyIgnoreCase(url, ConnectionType.JDBC_CONNECTION.getPrefix());
    }
}
