package tech.alexchen.designpattern.structural.facade.slf4j;

/**
 * @author alexchen
 * @date 2023/3/3
 */
public class Client {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Client.class);
        logger.info("log test");
    }
}
