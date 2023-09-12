package tech.alexchen.mysql.insertbatch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author alexchen
 */
@SpringBootApplication
@EnableTransactionManagement
public class InsertBatchApplication {

    public static void main(String[] args) {
        SpringApplication.run(InsertBatchApplication.class, args);
    }

}
