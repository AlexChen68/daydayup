package tech.alexchen.java.basic.flow;

/**
 * @author alexchen
 * @date 2023/2/25
 */
public class SwitchDemo {

    public static void main(String[] args) {
        choose(Gender.MALE);
    }

    public static void choose(Gender gender) {
        switch (gender) {
            case MALE:
                System.out.println("这是个男的");
                break;
            case FEMALE:
                System.out.println("这是个女的");
                break;
            default:
                throw new IllegalArgumentException("未知性别");
        }
    }

    public enum Gender {
        MALE,
        FEMALE;
    }
}
