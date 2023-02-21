import org.junit.*;

/**
 * @author alexchen
 * @date 2023/2/21
 */
public class IgnoreTest {

    @Ignore
    public void ignoreTest(){
        System.out.println("ignore test");
    }

    @Test
    public void testCase() {
        System.out.println("test case");
    }
}
