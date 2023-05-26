package tech.alexchen.mybatis.spring.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tech.alexchen.mybatis.spring.entity.SysUser;

/**
 * @author alexchen
 */
public interface UserMapper {

    @Select("SELECT * FROM sys_user WHERE user_id = #{userId}")
    SysUser getUser(@Param("userId") Integer userId);


    @Delete("DELETE from sys_user where user_id = #{userId}")
    int delete(@Param("userId") Integer userId);

    @Insert("INSERT into sys_user (user_id, username) values (#{userId}, #{username})")
    int addUser(SysUser user);
}
