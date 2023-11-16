package tech.alexchen.springboot.security.server.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author alexchen
 */
@RestController
public class HelloController {

    @RequestMapping("/login/success")
    public String loginSuccess() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Object principal = authentication.getPrincipal();
        String username = "";
        if (principal instanceof UserDetails) {
            username = ((UserDetails) principal).getUsername();
        } else {
            username = principal.toString();
        }
        return username + " 登录成功";
    }

    /**
     * 游客可以访问
     */
    @PreAuthorize("permitAll()")
    @RequestMapping("/hello")
    public String hello() {
        return "hello world";
    }

    /**
     * 登录后可访问
     */
    @RequestMapping("/order")
    public String order() {
        return "order";
    }

    /**
     * 要求 admin 角色登录
     */
    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    @RequestMapping("/admin")
    public String admin() {
        return "admin";
    }

    /**
     * 要求普通用户角色
     */
    @PreAuthorize("hasAnyRole('ADMIN', 'COMMON')")
    @RequestMapping("/user")
    public String user() {
        return "common user";
    }
}
