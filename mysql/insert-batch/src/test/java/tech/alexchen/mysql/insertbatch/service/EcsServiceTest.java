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
// 使用spring的测试框架
@ExtendWith(SpringExtension.class)
class EcsServiceTest {

    @Resource
    EcsService service;

    @Resource
    SqlSessionFactory sqlSessionFactory;

    static final Long TOTAL = 50000L;

    static final Integer BATCH_SIZE = 100000;

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
    @Test
    @Disabled
    void insertForeach() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < TOTAL; i++) {
            service.save(buildEcs());
        }
        long end = System.currentTimeMillis();
        System.out.println(StrUtil.format("Insert end, cost time {} ms", end - start));
    }

    @Test
    void insertBatchDefault() {
        List<Ecs> data = new ArrayList<>();
        for (int i = 0; i < TOTAL; i++) {
            data.add(buildEcs());
        }
        long start = System.currentTimeMillis();
        service.saveBatch(data);
        long end = System.currentTimeMillis();
        System.out.println(StrUtil.format("Insert end, cost time {} ms", end - start));
    }

    @Test
    void insertBatchCustom() {
        List<Ecs> data = new ArrayList<>();
        for (int i = 0; i < TOTAL; i++) {
            data.add(buildEcs());
        }
        long start = System.currentTimeMillis();
        service.saveBatch(data, BATCH_SIZE);
        long end = System.currentTimeMillis();
        System.out.println(StrUtil.format("Insert end, cost time {} ms", end - start));
    }

    @Test
    void insertBatchForeach() {
        SqlSession sqlSession = sqlSessionFactory.openSession(ExecutorType.BATCH,false);
        EcsMapper mapper = sqlSession.getMapper(EcsMapper.class);
        long start = System.currentTimeMillis();
        for (int i = 0; i < TOTAL; i++) {
            mapper.insert(buildEcs());
        }
        sqlSession.commit();
        sqlSession.close();
        long end = System.currentTimeMillis();
        System.out.println(StrUtil.format("Insert end, cost time {} ms", end - start));
    }
}