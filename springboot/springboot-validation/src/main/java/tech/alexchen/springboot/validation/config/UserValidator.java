package tech.alexchen.springboot.validation.config;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import tech.alexchen.springboot.validation.entity.User;

/**
 * @author alexchen
 */
public class UserValidator implements Validator {

    /**
     * 匹配 User 类型
     */
    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
    }
}
