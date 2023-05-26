package tech.alexchen.mybatis.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author alexchen
 * @date 2022/8/2
 */
public class MybatisUtil {

    public static SqlSessionFactory sqlSessionFactory;

    static {
        try {
            // 加载 sqlSessionFactory
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取 SqlSession
     * @return
     */
    public static SqlSession getSqlSession() {
        return sqlSessionFactory.openSession();
    }

    public static <T> T getMapper(Class<T> clazz) {
        SqlSession sqlSession = getSqlSession();
        return sqlSession.getMapper(clazz);
    }

}
