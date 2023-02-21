import org.junit.Test;
import org.junit.runner.OrderWith;
import org.junit.runner.manipulation.Alphanumeric;

/**
 * @author alexchen
 * @date 2023/2/21
 */
@OrderWith(Alphanumeric.class) // Version 4.13+
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MethodOrderTest {

    @Test
    public void testA() {
        System.out.println("testA");
    }

    @Test
    public void testC() {
        System.out.println("testC");
    }

    @Test
    public void testB() {
        System.out.println("testB");
    }
}
