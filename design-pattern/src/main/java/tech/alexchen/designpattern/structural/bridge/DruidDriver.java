package tech.alexchen.designpattern.structural.bridge;

import cn.hutool.core.util.StrUtil;

import java.sql.SQLException;

/**
 * @author alexchen
 * @date 2023/3/3
 */
public class DruidDriver extends AbstractDriver {

//    static {
//        DriverManager.registerDriver(new DruidDriver());
//    }

    @Override
    public boolean acceptsURL(String url) throws SQLException {
        System.out.println("DruidDriver");
        return StrUtil.containsAnyIgnoreCase(url, ConnectionType.LOADBALANCE_CONNECTION.getPrefix());
    }
}
