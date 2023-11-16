package tech.alexchen.springbootswagger.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author alexchen
 */
@Tag(name = "用户管理", description = "用户管理")
@RestController
@RequestMapping ("/user")
public class HelloController {

    @Operation(summary = "查询用户")
    @GetMapping
    public String getById(@RequestParam String userId) {
        return "admin";
    }

}
