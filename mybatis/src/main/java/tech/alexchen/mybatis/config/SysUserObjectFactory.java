package tech.alexchen.mybatis.config;

import org.apache.ibatis.reflection.factory.DefaultObjectFactory;
import tech.alexchen.mybatis.entity.SysUser;

import java.util.Collection;
import java.util.List;
import java.util.Properties;

/**
 * 对象工厂
 *
 * @author alexchen
 * @date 2022/8/2
 */
public class SysUserObjectFactory extends DefaultObjectFactory {

    @Override
    public <T> T create(Class<T> type) {
        T t = super.create(type);
        if (type.equals(SysUser.class)) {
            ((SysUser)t).setSalt("SysUserObjectFactory");
        }
        return t;
    }

    @Override
    public <T> T create(Class<T> type, List<Class<?>> constructorArgTypes, List<Object> constructorArgs) {
        return super.create(type, constructorArgTypes, constructorArgs);
    }

    @Override
    public void setProperties(Properties properties) {
        super.setProperties(properties);
    }

    @Override
    public <T> boolean isCollection(Class<T> type) {
        return Collection.class.isAssignableFrom(type);
    }
}
