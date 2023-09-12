package tech.alexchen.daydayup.designpattern.structural.bridge;

import lombok.SneakyThrows;

import java.sql.SQLException;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author alexchen
 * @date 2023/3/3
 */
public abstract class DriverManager {

    private static CopyOnWriteArrayList<Driver> registeredDrivers = new CopyOnWriteArrayList<>();
    public static void registerDriver(Driver driver) {
        registeredDrivers.addIfAbsent(driver);
    }

    @SneakyThrows
    public static Driver getDriver(String url) {
        for (Driver driver : registeredDrivers) {
            if (driver.acceptsURL(url)) {
                return driver;
            }
        }
        throw new SQLException("No suitable driver");
    }
    public static Connection getConnection(String url) {
       return getDriver(url).connection(url);
    }
}
