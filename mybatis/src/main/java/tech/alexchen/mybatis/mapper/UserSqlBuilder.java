package tech.alexchen.mybatis.mapper;

import org.apache.ibatis.jdbc.SQL;

/**
 * Mybatis 动态 SQL
 *
 * @author alexchen
 * @date 2022/8/3
 */
public class UserSqlBuilder {

    // 注意参数需要使用 final 修饰，以便匿名内部类对它们进行访问
    public static String buildGetUsersById(final Integer id) {
        return new SQL(){{
            SELECT("*");
            FROM("sys_user");
            if (id != null) {
                WHERE("user_id = #{id}");
            }
        }}.toString();
    }
}
