package tech.alexchen.daydayup.java.basic.enums;

/**
 * 枚举类实例
 *
 * @author alexchen
 * @date 2022/7/29
 */
public enum StringEnum {

    JAVA("java"),
    GO("go"),
    PYTHON("python");

    String data;

    StringEnum(String data) {
        this.data = data;
    }
}
