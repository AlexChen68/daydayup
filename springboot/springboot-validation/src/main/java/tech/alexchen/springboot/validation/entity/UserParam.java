package tech.alexchen.springboot.validation.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;
import tech.alexchen.springboot.validation.config.Phone;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author alexchen
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserParam implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotNull(message = "userId can not be empty")
    private Integer userId;

    @NotBlank(message = "userName can not be empty")
    private String userName;

    @Range(min = 0, max = 1, message = "gender should be 0-1")
    private Integer gender;

    @Max(value = 120, message = "Please input valid age")
    private Integer age;

//    @Pattern(regexp = "^1\\d{10}$", message = "Please input valid phone", groups = {UserAddValid.class})
    @Phone
    private String phone;

    @Email(message = "Please input valid email")
    private String email;

}
