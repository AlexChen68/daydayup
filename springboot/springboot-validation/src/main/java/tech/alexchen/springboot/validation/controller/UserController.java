package tech.alexchen.springboot.validation.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.alexchen.springboot.validation.entity.User;
import tech.alexchen.springboot.validation.entity.UserParam;

import javax.validation.Valid;
import java.util.List;

/**
 * @author alexchen
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping("/add1")
    public ResponseEntity addUser(@Valid @RequestBody UserParam user) {
        return ResponseEntity.ok(user);
    }

    @PostMapping("/add2")
    public ResponseEntity addUser(@Valid @RequestBody UserParam user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            logError(bindingResult);
            return ResponseEntity.badRequest().body("invalid parameter");
        }
        return ResponseEntity.ok("success");
    }

    @PostMapping("/group/add")
    public ResponseEntity groupAddUser(@Validated(User.UserAddValid.class) @RequestBody User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            logError(bindingResult);
            return ResponseEntity.badRequest().body("invalid parameter");
        }
        return ResponseEntity.ok(user);
    }

    @PostMapping("/group/update")
    public ResponseEntity groupUpdateUser(@Validated(User.UserUpdateValid.class) @RequestBody User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            logError(bindingResult);
            return ResponseEntity.badRequest().body("invalid parameter");
        }
        return ResponseEntity.ok(user);
    }

    private void logError(BindingResult bindingResult) {
        List<ObjectError> errors = bindingResult.getAllErrors();
        errors.forEach(p -> {
            FieldError fieldError = (FieldError) p;
            log.error("Invalid Parameter : object: {}, field: {}, errorMessage: {}", fieldError.getObjectName(), fieldError.getField(), fieldError.getDefaultMessage());
        });
    }
}
