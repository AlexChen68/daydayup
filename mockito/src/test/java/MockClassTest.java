import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.mockito.Mockito.mock;

/**
 * @author alexchen
 * @date 2023/2/22
 */
public class MockClassTest {

    @Test
    void mockClassTest() {
        Random mockRandom = mock(Random.class);

        // 默认值: mock 对象的方法的返回值默认都是返回类型的默认值
        System.out.println(mockRandom.nextBoolean()); // false
        System.out.println(mockRandom.nextInt()); // 0
        System.out.println(mockRandom.nextDouble()); // 0.0
    }

}
