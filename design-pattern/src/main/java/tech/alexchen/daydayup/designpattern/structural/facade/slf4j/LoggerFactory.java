package tech.alexchen.daydayup.designpattern.structural.facade.slf4j;

/**
 * @author alexchen
 * @date 2023/3/3
 */
public final class LoggerFactory {

    public static  Logger getLogger(Class clazz) {
        return getLogger(clazz.getName());
    }

    public static Logger getLogger(String name) {
        ILoggerFactory iLoggerFactory = getILoggerFactory();
        return iLoggerFactory.getLogger(name);
    }

    public static ILoggerFactory getILoggerFactory() {
        // slf4j 是通过类加载器去寻找 ILoggerFactory 的实现类的
        // 这里演示只返回固定的实现类了
        return new CustomLoggerFactory();
    }
}
