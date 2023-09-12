package tech.alexchen.daydayup.designpattern.structural.facade.slf4j;

/**
 * @author alexchen
 * @date 2023/3/3
 */
public class CustomLogger implements Logger {

    String name;

    public CustomLogger(Class clazz) {
        this.name = clazz.getName();
    }

    public CustomLogger(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void trace(String logInfo) {
        System.out.println("trace: " + logInfo);
    }

    @Override
    public void debug(String logInfo) {
        System.out.println("debug: " + logInfo);
    }

    @Override
    public void info(String logInfo) {
        System.out.println("info: " + logInfo);
    }

    @Override
    public void warn(String logInfo) {
        System.out.println("warn: " + logInfo);
    }

    @Override
    public void error(String logInfo) {
        System.out.println("error: " + logInfo);
    }
}
