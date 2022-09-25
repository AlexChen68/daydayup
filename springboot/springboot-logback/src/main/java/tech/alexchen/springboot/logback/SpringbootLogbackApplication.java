package tech.alexchen.springboot.logback;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class SpringbootLogbackApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootLogbackApplication.class, args);
		log.info("----------------- Started -----------------");
		String msg = "print log, current level: {}";
		log.trace(msg, "trace");
		log.debug(msg, "debug");
		log.info(msg, "info");
		log.warn(msg, "warn");
		log.error(msg, "error");
	}

}
