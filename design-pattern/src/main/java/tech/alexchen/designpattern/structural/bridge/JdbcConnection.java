package tech.alexchen.designpattern.structural.bridge;

/**
 * @author alexchen
 * @date 2023/3/3
 */
public class JdbcConnection implements Connection {

    @Override
    public void prepareStatement() {
        System.out.println("JdbcConnection");
    }
}
