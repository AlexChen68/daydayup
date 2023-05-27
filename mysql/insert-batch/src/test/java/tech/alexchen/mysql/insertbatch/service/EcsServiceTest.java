package tech.alexchen.mysql.insertbatch.service;

import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.RandomUtil;
import cn.hutool.core.util.StrUtil;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import tech.alexchen.mysql.insertbatch.bean.Ecs;
import tech.alexchen.mysql.insertbatch.mapper.EcsMapper;

import javax.annotation.Resource;

import java.time.LocalDateTime;
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

    @Resource
    SqlSessionFactory sqlSessionFactory;

    Ecs buildEcs() {
        Ecs ecs = new Ecs();
        ecs.setName(IdUtil.fastUUID());
        int cpu = 1 << RandomUtil.randomInt(8);
        ecs.setCpu(cpu);
        ecs.setMemory(cpu * 2);
        ecs.setCreateTime(LocalDateTime.now());
        ecs.setCreateBy(RandomUtil.randomString(5));
        ecs.setTenantId(RandomUtil.randomLong(10));
        return ecs;
    }

    @Test
    @Disabled
    void insertOne() {
        service.save(buildEcs());
    }

//    @Disabled
    @ParameterizedTest
    @ValueSource(ints = {1000, 5000, 10000})
    void insertForeach(int total) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < total; i++) {
            service.save(buildEcs());
        }
        long end = System.currentTimeMillis();
        System.out.println(StrUtil.format("insertForeach: {}, cost time {} ms", total, end - start));
    }

    @ParameterizedTest
    @ValueSource(ints = {10000, 50000, 100000, 500000})
    void insertForeachWithTransactional(int total) {
        SqlSession sqlSession = sqlSessionFactory.openSession(ExecutorType.BATCH, false);
        EcsMapper mapper = sqlSession.getMapper(EcsMapper.class);
        long start = System.currentTimeMillis();
        for (int i = 0; i < total; i++) {
            mapper.insert(buildEcs());
        }
        sqlSession.commit();
        sqlSession.close();
        long end = System.currentTimeMillis();
        System.out.println(StrUtil.format("insertBatchForeach: {}, cost time {} ms", total, end - start));
    }

    @ParameterizedTest
    @ValueSource(ints = {10000, 50000, 100000, 500000})
    void insertBatchDefault(int total) {
        List<Ecs> data = new ArrayList<>();
        for (int i = 0; i < total; i++) {
            data.add(buildEcs());
        }
        long start = System.currentTimeMillis();
        service.saveBatch(data);
        long end = System.currentTimeMillis();
        System.out.println(StrUtil.format("insertBatchDefault: {}, cost time {} ms", total, end - start));
    }

    @ParameterizedTest
    @ValueSource(ints = {10000, 50000, 100000, 500000})
    void insertBatchCustom(int total) {
        List<Ecs> data = new ArrayList<>();
        for (int i = 0; i < total; i++) {
            data.add(buildEcs());
        }
        long start = System.currentTimeMillis();
        service.saveBatch(data, 500000);
        long end = System.currentTimeMillis();
        System.out.println(StrUtil.format("insertBatchCustom: {}, cost time {} ms", total, end - start));
    }

}