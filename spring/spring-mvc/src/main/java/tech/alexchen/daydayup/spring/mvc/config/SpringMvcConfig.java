package tech.alexchen.daydayup.spring.mvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import tech.alexchen.daydayup.spring.mvc.controller.HelloController;
import tech.alexchen.daydayup.spring.mvc.intercaptor.HelloInterceptor;

/**
 * 1. 开启 @EnableWebMvc：将此注解添加到@Configuration类会从WebMvcConfigurationSupport导入 Spring MVC 配置（仅一个配置类添加）；
 * 2. 在配置类中实现 WebMvcConfigurer，通过重写方法实现配置。
 *
 * @author alexchen
 */
@Configuration
@EnableWebMvc
@ComponentScan("tech.alexchen.spring.mvc")
public class SpringMvcConfig implements WebMvcConfigurer {

    /**
     * 配置视图解析器的前缀和后缀
     */
    @Bean
    public InternalResourceViewResolver internalResourceViewResolver() {
        return new InternalResourceViewResolver("/WEB-INF/jsp/", ".jsp");
    }

    /**
     * 配置 /hello 的控制处理器为 helloController
     */
    @Bean("/hello")
    public HelloController helloController() {
        return new HelloController();
    }

    /**
     * 注册视图解析器
     */
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        WebMvcConfigurer.super.configureViewResolvers(registry);
//        registry.jsp("/WEB-INF/jsp/", ".jsp");
        registry.viewResolver(internalResourceViewResolver());
    }

    /**
     * 跨域配置
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        WebMvcConfigurer.super.addCorsMappings(registry);
        registry.addMapping("/cors/**")
                .allowedHeaders("*")
                .allowedMethods("POST","GET")
                .allowedOrigins("*");
    }

    /**
     * 配置拦截器
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        WebMvcConfigurer.super.addInterceptors(registry);
        registry.addInterceptor(new HelloInterceptor()).addPathPatterns("/hello");
    }

    @Bean("multipartResolver")
    public CommonsMultipartResolver multipartResolver() {
        return new CommonsMultipartResolver();
    }
}
