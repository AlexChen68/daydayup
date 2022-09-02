package tech.alexchen.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 使用 SpringMvc 注解开发
 *
 * @author alexchen
 */
@Controller
public class AnnotationController {

    @RequestMapping("annotation")
    public String post(Model model) {
        System.out.println("AnnotationController");
        // 封装数据
        model.addAttribute("msg", "AnnotationController");
        // 返回视图
        return "annotation";
    }
}
