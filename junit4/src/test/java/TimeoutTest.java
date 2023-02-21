import org.junit.Test;

import java.util.concurrent.TimeUnit;

/**
 * @author alexchen
 * @date 2023/2/21
 */
public class TimeoutTest {

    @Test(timeout = 1000)
    public void testCase1() throws InterruptedException {
        TimeUnit.SECONDS.sleep(5000);
        System.out.println("in timeout exception");
    }
}
