import org.junit.jupiter.api.Test;

import java.util.List;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.Mockito.*;

/**
 * @author alexchen
 * @date 2023/2/22
 */
public class MatcherTest {

    @Test
    void test() {
        List mockedList = mock(List.class);

        // 使用内置的anyInt()参数匹配器
        when(mockedList.get(anyInt())).thenReturn("element");

        // 获取任一位置的元素，都返回 "element"
        System.out.println(mockedList.get(999));

        // 你也可以验证参数匹配器
        verify(mockedList).get(anyInt());
    }


}
