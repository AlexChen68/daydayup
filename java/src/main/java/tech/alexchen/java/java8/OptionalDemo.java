package tech.alexchen.java.java8;

import java.util.Optional;

/**
 * @author alexchen
 */
public class OptionalDemo {

    public static void main(String[] args) {
        Optional<String> nullOptional = Optional.ofNullable(null);
        Optional<String> optional = Optional.of("hello world");
        Optional<String> empty = Optional.empty();

        System.out.println(nullOptional.isPresent());
        System.out.println(optional.isPresent());

        System.out.println(optional.get());
        System.out.println(nullOptional.get());

        optional.ifPresent((value) -> {
            System.out.println(value);
        });

        System.out.println(nullOptional.orElse("there is no value!"));

        System.out.println(nullOptional.orElseGet(() -> {
            return "default value";
        }));

        try {
            nullOptional.orElseThrow(() -> new RuntimeException("there is no value present!"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Optional<String> newOptional = optional.map((value) -> "new " + value);
        System.out.println(newOptional.get());

        optional = optional.flatMap((value) -> {
            if (value != null && value.contains("hello")) {
                return Optional.of("valid");
            } else {
                return Optional.ofNullable(null);
            }
        });
        System.out.println(optional.get());

        nullOptional = nullOptional.filter((value) -> value != null && value.length() > 6);
        optional = optional.filter((value) -> value != null && value.length() > 6);
        System.out.println(nullOptional.orElse("The value is less than 6 characters"));
        System.out.println(optional.orElse("The value is less than 6 characters"));
    }
}
