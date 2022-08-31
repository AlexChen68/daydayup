package tech.alexchen.spring.ioc.bean;

import java.util.List;

/**
 * @author alexchen
 * @date 2022/8/5
 */
public interface SysUserService {

    List<SysUser> findUserList();

}
