package tech.alexchen.mybatis.spring.service;

import tech.alexchen.mybatis.spring.entity.SysUser;

/**
 * @author alexchen
 */
public interface SysUserService {

    SysUser getUser(Integer userId);

    void addAndDelete();
}
