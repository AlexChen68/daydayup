package suite;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * “套件测试”是指捆绑了几个单元测试用例并运行起来。在JUnit中，@RunWith 和 @Suite 这两个注解是用来运行套件测试
 *
 * @author alexchen
 * @date 2023/2/21
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        /**
         * 此处类的配置顺序会影响执行顺序
         */
        JunitTest1.class,
        JunitTest2.class
})
public class JunitSuiteTest {

    /**
     * 这里的 test 不会生效了
     */
    @Test
    public void printMessage(){
        System.out.println("Suite Test");
    }
}
