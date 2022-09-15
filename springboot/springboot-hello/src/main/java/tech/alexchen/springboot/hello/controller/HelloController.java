package tech.alexchen.springboot.hello.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.alexchen.springboot.hello.Bean.User;

/**
 * @author alexchen
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        return new ResponseEntity("hello world", HttpStatus.OK);
    }

    @GetMapping("/string")
    public String getString() {
        return "string";
    }

    @GetMapping("object")
    public User getObject() {
        return new User(1, "alexchen");
    }

    @GetMapping("/404")
    public ResponseEntity<String> error() {

        return new ResponseEntity("404 not found", HttpStatus.NOT_FOUND);
    }
}
