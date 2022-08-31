package tech.alexchen.spring.ioc.bean;

import tech.alexchen.spring.ioc.bean.SysUser;

import java.util.List;

/**
 * @author alexchen
 */
public interface SysUserDao {

    List<SysUser> findUserList();
}
