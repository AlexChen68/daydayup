package tech.alexchen.mybatis.mapper;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.RandomUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONUtil;
import com.github.pagehelper.PageHelper;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tech.alexchen.mybatis.entity.SysUser;
import tech.alexchen.mybatis.util.MybatisUtil;

import java.util.List;

/**
 * @author alexchen
 * @date 2022/8/3
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SysUserMapperTest {

    private static final Logger logger = LoggerFactory.getLogger(SysUserMapperTest.class);

    private static SqlSession sqlSession;
    private static SysUserMapper mapper;
    private static Integer key;

    @BeforeAll
    static void init() {
        sqlSession = MybatisUtil.getSqlSession();
        mapper = sqlSession.getMapper(SysUserMapper.class);
    }

    @Test
    @Order(1)
    void insert() {
        SysUser user = new SysUser();
        user.setUsername(RandomUtil.randomString(5));
        user.setPhone("18888888888");
        user.setTenantId(1);

        int result = mapper.insert(user);
        key = user.getUserId();
        logger.info("生产的主键 key : {}", key);
        Assertions.assertTrue(result > 0);
    }

    @Test
    @Order(2)
    void update() {
        SysUser user = mapper.getById(key);
        user.setUsername(StrUtil.format("{}-{}", "update", DateUtil.now()));

        boolean flag = mapper.updateById(user);
        Assertions.assertTrue(flag);
    }

    @Test
    @Order(3)
    void getById() {
        // 清空本地缓存
//        sqlSession.clearCache();
        SysUser user = mapper.getById(key);
        logger.info(JSONUtil.toJsonStr(user));
    }

    @Test
    @Order(4)
    void remove() {
        boolean flag = mapper.removeById(key);
        Assertions.assertTrue(flag);
    }

    @Test
    @Order(5)
    void page() {
        PageHelper.startPage(1, 3);
        List<SysUser> page = mapper.page(1);
        for (SysUser user : page) {
            logger.info(JSONUtil.toJsonStr(user));
        }
    }

    @Test
    @Order(10)
    void sqlSessionCacheTest() {
        key = 1;
        SysUser user = mapper.getById(key);
        logger.info(JSONUtil.toJsonStr(user));

//        sqlSession.clearCache();

        logger.info("------------------------------");
        // SQL 只执行了一次
        SysUser sameUser = mapper.getById(key);
        logger.info(JSONUtil.toJsonStr(sameUser));
        Assertions.assertTrue(user == sameUser);
    }

    @Test
    @Order(Integer.MAX_VALUE)
    void mapperCacheTest() {
        key = 1;
        SysUser user = mapper.getById(key);
        logger.info(JSONUtil.toJsonStr(user));
        // 当 sqlSession 关闭时，如果开启了二级缓存，会将一级缓存当内容缓存到二级缓存
        update();
        sqlSession.close();



        // 重新获取 sqlSession
        SqlSession anotherSqlSession = MybatisUtil.getSqlSession();
        SysUserMapper anotherMapper = anotherSqlSession.getMapper(SysUserMapper.class);
        SysUser sameUser = anotherMapper.getById(key);
        logger.info(JSONUtil.toJsonStr(sameUser));
        logger.info(user == sameUser ? "二级缓存生效" : "二级缓存未生效");
    }

    @AfterAll
    static void close() {
        try {
            sqlSession.commit();
            sqlSession.close();
        } catch (Exception e) {
            // doNothing
        }
    }
}
