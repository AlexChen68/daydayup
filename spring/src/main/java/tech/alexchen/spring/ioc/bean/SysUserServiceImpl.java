package tech.alexchen.spring.ioc.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author alexchen
 * @date 2022/8/5
 */
@Service("userService")
public class SysUserServiceImpl implements SysUserService {

    private SysUserDao userDao;

    public SysUserServiceImpl() {
    }

    @Autowired
    public SysUserServiceImpl(SysUserDao userDao) {
        this.userDao = userDao;
    }

    public void setUserDao(SysUserDao userDao) {
        this.userDao = userDao;
    }

    // 业务方法
    public List<SysUser> findUserList() {
        return userDao.findUserList();
    }

}
