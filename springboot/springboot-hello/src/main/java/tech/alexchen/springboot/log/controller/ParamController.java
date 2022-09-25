package tech.alexchen.springboot.log.controller;

import org.springframework.web.bind.annotation.*;
import tech.alexchen.springboot.log.Bean.User;

/**
 * @author alexchen
 */
@RestController
@RequestMapping("/param")
public class ParamController {

    /**
     * /param/{id}
     */
    @GetMapping("/{id}")
    public Integer pathVariable(@PathVariable Integer id) {
        System.out.println("Get pathVariable: " + id);
        return id;
    }

    /**
     * /param/requestParam?name={name}
     */
    @GetMapping("/requestParam")
    public String requestParam(@RequestParam("name") String name) {
        System.out.println("Get requestParam: " + name);
        return name;
    }

    /**
     * /param/requestBody
     * {
     *     "id":1,
     *     "name": "alexchen"
     * }
     */
    @PostMapping("/requestBody")
    public User requestBody(@RequestBody User user) {
        System.out.println("Get requestBody param: " + user.toString());
        return user;
    }
}
