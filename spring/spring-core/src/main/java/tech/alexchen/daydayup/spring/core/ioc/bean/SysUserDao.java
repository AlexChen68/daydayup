package tech.alexchen.daydayup.spring.core.ioc.bean;

import java.util.List;

/**
 * @author alexchen
 */
public interface SysUserDao {

    List<SysUser> findUserList();
}
