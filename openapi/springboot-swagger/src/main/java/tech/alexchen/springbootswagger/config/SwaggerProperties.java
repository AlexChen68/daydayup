package tech.alexchen.springbootswagger.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author alexchen
 */
@Data
@ConfigurationProperties(prefix ="springdoc.info")
public class SwaggerProperties {

    // ApiInfo
    private String title = "Zeus Api Documentation";
    private String description = "Zeus Api Documentation";
    private String contactName = "AlexChen";
    private String contactUrl = "https://www.alexchen.tech";
    private String contactEmail = "alexchen.tech@gmail.com";
    private String version = "1.0";
    private String license = "MIT License";
    private String licenseUrl = "https://opensource.org/licenses/MIT";

}
