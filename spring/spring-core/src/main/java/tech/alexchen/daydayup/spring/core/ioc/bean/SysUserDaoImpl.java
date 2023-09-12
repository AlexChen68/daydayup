package tech.alexchen.daydayup.spring.core.ioc.bean;

import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * 用户数据访问层
 *
 * @author alexchen
 * @date 2022/8/5
 */
@Service("userDao")
public class SysUserDaoImpl implements SysUserDao {

    public List<SysUser> findUserList() {
        // mock 数据
        SysUser user = new SysUser();
        user.setUserId(1);
        user.setUsername("admin");
        user.setTenantId(1);
        return Collections.singletonList(user);
    }

}
