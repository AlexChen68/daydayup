import org.junit.Test;

/**
 * @author alexchen
 * @date 2023/2/21
 */
public class ExceptionTest {

    @Test(expected = ArithmeticException.class)
    public void exceptionTest() {
        System.out.println("in exception success test");
        int a = 0;
        int b = 1 / a;
    }

    @Test(expected = NullPointerException.class)
    public void exceptionFailTest() {
        System.out.println("in exception fail test");
        int a = 0;
        int b = 1 / a;
    }
}
