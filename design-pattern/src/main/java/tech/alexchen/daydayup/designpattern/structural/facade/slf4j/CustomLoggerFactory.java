package tech.alexchen.daydayup.designpattern.structural.facade.slf4j;

import java.util.HashMap;
import java.util.Map;

/**
 * @author alexchen
 * @date 2023/3/3
 */
public class CustomLoggerFactory implements ILoggerFactory {

    private Map<String, Logger> loggerCache;

    public CustomLoggerFactory() {
        this.loggerCache = new HashMap<>();
    }

    @Override
    public Logger getLogger(String name) {
        if (name == null) {
            throw new IllegalArgumentException("name argument cannot be null");
        }
        Logger logger = loggerCache.get(name);
        if (logger != null) {
            return logger;
        }
        CustomLogger customLogger = new CustomLogger(name);
        loggerCache.put(name, customLogger);
        return customLogger;
    }
}
