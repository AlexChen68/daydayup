import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author alexchen
 * @date 2023/2/22
 */
public class HelloWorldTest {

    @Test
    @BeforeEach
    void firstTest() {
        assertEquals(2, 1 + 1);
    }
}
