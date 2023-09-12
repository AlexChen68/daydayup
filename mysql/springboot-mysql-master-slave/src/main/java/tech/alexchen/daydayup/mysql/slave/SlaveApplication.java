package tech.alexchen.daydayup.mysql.slave;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author alexchen
 */
@SpringBootApplication
@MapperScan("tech.alexchen.daydayup.mysql.slave.mapper")
public class SlaveApplication {

    public static void main(String[] args) {
        SpringApplication.run(SlaveApplication.class, args);
    }
}
