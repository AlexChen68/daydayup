package tech.alexchen.daydayup.java.basic.reflection;

/**
 * @author alexchen
 */
public class People {

    private String name;
    private Integer age;
    public String info;
    private People() {}

    public People(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
