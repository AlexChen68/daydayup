package tech.alexchen.daydayup.spring.core.propertyeditor.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author alexchen
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    String country;

    String province;

    String city;
}
