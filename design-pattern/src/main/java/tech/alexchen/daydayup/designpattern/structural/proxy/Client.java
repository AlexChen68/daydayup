package tech.alexchen.daydayup.designpattern.structural.proxy;

import java.lang.reflect.Proxy;

/**
 * 静态代理，代理类由编程实现；
 * 动态代理，在运行时生成代理类，动态扩展代理方法的实现；
 *
 * @author alexchen
 */
public class Client {

    public static void main(String[] args) {
        // 具体代理类
        RealSubject realSubject = new RealSubject();

        // 静态代理
        StaticProxy staticProxy = new StaticProxy();
        staticProxy.setSubject(realSubject);
        staticProxy.operation();

        // 动态代理
        Subject dynamicProxy = (Subject)Proxy.newProxyInstance(realSubject.getClass().getClassLoader(),
                realSubject.getClass().getInterfaces(),
                // InvocationHandler 的实现类
                (p, method, params) -> {
                    System.out.println("动态代理");
                    return method.invoke(realSubject, params);
                });
        dynamicProxy.operation();
    }
}
