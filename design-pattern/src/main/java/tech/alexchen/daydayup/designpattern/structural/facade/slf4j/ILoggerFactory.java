package tech.alexchen.daydayup.designpattern.structural.facade.slf4j;

/**
 * @author alexchen
 * @date 2023/3/3
 */
public interface ILoggerFactory {

    Logger getLogger(String name);

}
