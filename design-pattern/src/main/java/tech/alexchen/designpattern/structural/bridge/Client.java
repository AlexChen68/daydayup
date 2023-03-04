package tech.alexchen.designpattern.structural.bridge;

/**
 * @author alexchen
 * @date 2023/3/3
 */
public class Client {

    public static void main(String[] args) {
        DriverManager.registerDriver(new JdbcDriver());
//        DriverManager.registerDriver(new DruidDriver());
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/demo");
//        Connection connection = DriverManager.getConnection("jdbc:mysql:loadbalance://127.0.0.1:3306/demo");
        connection.prepareStatement();
    }
}
