package tech.alexchen.springboot.validation.config;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Pattern;

/**
 * 自定义验证注解 @Phone 的校验器
 *
 * @author alexchen
 */
public class PhoneValidator implements ConstraintValidator<Phone, String> {

    private static final String PHONE_REGEX = "^1\\d{10}$";

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        try {
            return Pattern.matches(PHONE_REGEX, value);
        } catch (Exception e) {
            return false;
        }
    }
}
