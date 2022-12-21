package tech.alexchen.spring.core.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Method;

/**
 * 注解实现 AOP 日志切面
 *
 * @author alexchen
 */
@Aspect
@Configuration
public class AnnotationLogAspect {

    @Pointcut("execution(* tech.alexchen.spring.core.aop.*.*(..))")
    public void pointCut() {}

    @Before("pointCut()")
    public void before() {
        System.out.println("方法执行前");
    }

    @After("pointCut()")
    public void after() {
        System.out.println("方法执行后");
    }

    @Around("pointCut()")
    public Object businessService(ProceedingJoinPoint pjp) throws Throwable {
        Method method = ((MethodSignature) pjp.getSignature()).getMethod();
        System.out.println("execute method: " + method.getName());
        return pjp.proceed();
    }
}
