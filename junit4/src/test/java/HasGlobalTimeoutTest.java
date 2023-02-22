import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * @author alexchen
 * @date 2023/2/21
 */
public class HasGlobalTimeoutTest {

//
    private final CountDownLatch latch = new CountDownLatch(1);

    @Rule
    public Timeout globalTimeout = Timeout.seconds(3); // 3 seconds max per method tested

    @Test
    public void testSleepForTooLong() throws Exception {
        TimeUnit.SECONDS.sleep(5); // sleep for 5 seconds
    }

    @Test
    public void testBlockForever() throws Exception {
        latch.await(); // will block
    }

}
