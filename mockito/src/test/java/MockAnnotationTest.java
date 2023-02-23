import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Random;

import static org.mockito.Mockito.when;

/**
 * @author alexchen
 * @date 2023/2/22
 */
@ExtendWith(MockitoExtension.class)
public class MockAnnotationTest {

    @Mock
    private Random random;
    @Test
    public void test() {
        when(random.nextInt()).thenReturn(100);
        System.out.println(random.nextInt());
    }
}
