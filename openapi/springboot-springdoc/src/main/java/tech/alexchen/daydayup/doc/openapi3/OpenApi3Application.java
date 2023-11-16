package tech.alexchen.daydayup.doc.openapi3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author alexchen
 */
@SpringBootApplication
public class OpenApi3Application {

    public static void main(String[] args) {
        SpringApplication.run(OpenApi3Application.class, args);
        System.out.println("Interface docs url：http://localhost:8080/swagger-ui/index.html");
    }
}
