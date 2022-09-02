package tech.alexchen.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 使用 SpringMvc 注解开发
 *
 * @author alexchen
 */
@Controller
public class AnnotationController {

    @RequestMapping("annotation")
    public String post(ModelAndView modelAndView) {
        System.out.println("AnnotationController");
        modelAndView.addObject("msg", "AnnotationController");
        return "annotation";
    }
}
