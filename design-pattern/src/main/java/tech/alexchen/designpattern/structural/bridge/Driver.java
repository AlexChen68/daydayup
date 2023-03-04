package tech.alexchen.designpattern.structural.bridge;

import java.sql.SQLException;

/**
 * @author alexchen
 * @date 2023/3/3
 */
public interface Driver {

    Connection connection(String url);

    boolean acceptsURL(String url) throws SQLException;
}
