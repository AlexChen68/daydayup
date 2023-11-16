package tech.alexchen.daydayup.doc.openapi3.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

/**
 * @author alexchen
 */
@RestController
@Tag(name = "user")
@RequestMapping("/user")
public class UserController {

    @Operation(summary = "保存用户")
    @PostMapping
    public Boolean saveUser(String user) {
        return true;
    }

    @Operation(summary = "更新用户")
    @PutMapping
    public Boolean updateUser(String user) {
        return true;
    }

    @Operation(summary = "获取用户信息")
    @GetMapping
    public String getUser(String userId) {
        return userId;
    }
}
