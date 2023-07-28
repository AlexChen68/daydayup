package tech.alexchen.daydayup.doc.openapi3.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author alexchen
 */
@Tag(name = "Hello")
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Operation(summary = "world")
    @GetMapping("/world")
    public String world() {
        return "world";
    }

    @Operation(summary = "java")
    @GetMapping("/java")
    public String java() {
        return "java";
    }

    @Operation(summary = "python")
    @GetMapping("/python")
    public String python() {
        return "python";
    }
}
