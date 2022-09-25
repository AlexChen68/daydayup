package tech.alexchen.springboot.logback.controller;

import cn.hutool.json.JSONUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tech.alexchen.springboot.logback.Bean.User;

/**
 * @author alexchen
 */
@Slf4j
@RestController
public class LogController {

    // 使用 slf4j 的方式之一，还可以使用 lombok 的 @Slf4j 注解
    // private static final Logger log = LoggerFactory.getLogger(LogController.class);

    @PostMapping("/log")
    public String printLog(@RequestBody User user) {
        log.info("exec printLog()");
        log.debug("user info : {}", JSONUtil.toJsonStr(user));
        return "ok";
    }

}
