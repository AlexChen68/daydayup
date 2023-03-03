package tech.alexchen.designpattern.structural.facade.slf4j;

/**
 * @author alexchen
 * @date 2023/3/3
 */
public interface Logger {

    String getName();
    void trace(String logInfo);
    void debug(String logInfo);
    void info(String logInfo);
    void warn(String logInfo);
    void error(String logInfo);
}
