import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * @author alexchen
 * @date 2023/2/22
 */
public class StubTest {

    @Test
    void test() {
        // 你可以mock具体的类型,不仅只是接口
        LinkedList mockedList = mock(LinkedList.class);

        // 测试桩
        when(mockedList.get(0)).thenReturn("first");
        when(mockedList.get(1)).thenThrow(new RuntimeException());

        // 输出“first”
        System.out.println(mockedList.get(0));

        // 抛出异常
        System.out.println(mockedList.get(1));
    }
}
