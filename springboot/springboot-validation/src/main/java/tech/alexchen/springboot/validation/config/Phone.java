package tech.alexchen.springboot.validation.config;

/**
 * 自定义验证注解 @Phone
 *
 * @author alexchen
 */

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE })
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = {PhoneValidator.class}) // 指定校验器
public @interface Phone {

    String message() default "Invalid phone number";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
