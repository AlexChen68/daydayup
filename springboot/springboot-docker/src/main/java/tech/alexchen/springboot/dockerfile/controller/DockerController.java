package tech.alexchen.springboot.dockerfile.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author alexchen
 */
@RestController
public class DockerController {

    @RequestMapping("/")
    public String index() {
        return "Hello Docker!";
    }
}
