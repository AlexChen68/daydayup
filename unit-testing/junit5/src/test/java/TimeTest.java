import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

/**
 * @author alexchen
 * @date 2023/2/22
 */
public class TimeTest {

    @Test
    @DisplayName("TimeTest1")
    @Timeout(value = 3)
    void testCase1() throws InterruptedException {
        TimeUnit.SECONDS.sleep(5);
    }

    @Test
    @DisplayName("TimeTest2")
    void testCase2() {
        // 会执行完再失败
        Assertions.assertTimeout(Duration.ofSeconds(3), () -> TimeUnit.SECONDS.sleep(5));
    }

    @Test
    @DisplayName("TimeTest3")
    void testCase3() {
        // 超时直接失败
        Assertions.assertTimeoutPreemptively(Duration.ofSeconds(3), () -> TimeUnit.SECONDS.sleep(5));
    }
}
