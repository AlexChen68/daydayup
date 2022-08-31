package tech.alexchen.mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import tech.alexchen.mybatis.entity.SysUser;

import java.util.List;

/**
 * @author alexchen
 * @date 2022/8/2
 */
@Mapper
public interface SysUserMapper {

//    @SelectProvider(type = UserSqlBuilder.class, method = "buildGetUsersById")
    SysUser getById(Integer id);

    int insert(SysUser user);

    boolean updateById(SysUser user);

    boolean removeById(Integer id);

    @Select("select * from sys_user")
    List<SysUser> page(Integer page);
}
