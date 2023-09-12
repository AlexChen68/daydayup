package tech.alexchen.mysql.index.service;

import cn.hutool.core.util.StrUtil;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import tech.alexchen.mysql.index.bean.Ecs;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author alexchen
 */
@SpringBootTest
@ExtendWith(SpringExtension.class)
class EcsServiceTest {

    @Resource
    EcsService service;

    @ParameterizedTest
    @ValueSource(ints = {5_000_000})
    void initData(int total) {
        List<Ecs> data = new ArrayList<>();
        for (int i = 0; i < total; i++) {
            data.add(Ecs.build());
        }
        long start = System.currentTimeMillis();
        service.saveBatch(data);
        long end = System.currentTimeMillis();
        System.out.println(StrUtil.format("insertBatchDefault: {}, cost time {} ms", total, end - start));
    }
}