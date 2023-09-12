package tech.alexchen.daydayup.designpattern.structural.bridge;

/**
 * @author alexchen
 * @date 2023/3/3
 */
public class LoadBalancedConnection implements Connection{


    @Override
    public void prepareStatement() {
        System.out.println("LoadBalancedConnection");
    }
}
