package tech.alexchen.mybatis.spring.service;

import cn.hutool.core.lang.Assert;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tech.alexchen.mybatis.spring.entity.SysUser;
import tech.alexchen.mybatis.spring.mapper.UserMapper;

/**
 * 方式一：直接注入 SqlSessionTemplate，从中获取 Mapper 实例；
 * 方式二：直接注入 Mapper 实例；
 * 方式三：继承 SqlSessionDaoSupport，通过 getSqlSession() 获取 SqlSessionTemplate 实例。
 *
 * @author alexchen
 */
@Service
public class SysUserServiceImpl implements SysUserService {

    private SqlSessionTemplate sqlSession;
    private UserMapper userMapper;

    @Autowired
    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public SysUser getUser(Integer userId) {
//        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        SysUser user = userMapper.getUser(1);
        return user;
    }

    /**
     * 开启事务后，添加用户和删除用户必须同时成功，有一个抛异常则会回滚
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void addAndDelete() {
        SysUser user = new SysUser();
//        user.setUserId(100);
        user.setUsername("transaction test");
        user.setTenantId(1);

        int add = userMapper.addUser(user);
        System.out.println(add > 0 ? "增加成功" : "增加失败");

        int delete = userMapper.delete(27);
        System.out.println(delete > 0 ? "删除成功" : "删除失败");
        Assert.isTrue(add > 0 && delete > 0);
    }


}
