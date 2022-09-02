package tech.alexchen.spring.mvc.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 实现 Spring 的 Controller 控制器的接口，注册为控制器；
 * 通过解析路径，由 DispatcherServlet 转发至对应控制器处理。
 *
 * @author alexchen
 */
public class HelloController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("HelloController param:" + request.getParameter("param"));
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg", request.getParameter("param"));
        modelAndView.setViewName("hello");
        return modelAndView;
    }
}
