package tech.alexchen.daydayup.redis.cache.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import tech.alexchen.daydayup.redis.cache.entity.User;

import java.util.HashMap;
import java.util.Map;

/**
 * @author alexchen
 */
@Slf4j
@Service
@CacheConfig(cacheNames = "system:user")
public class UserServiceImpl implements UserService {

    public static Map<Long, User> cacheUsers = new HashMap<>();

    @Override
    @CacheEvict(allEntries = true)
    public void saveUser(User user) {
        cacheUsers.put(user.getId(), user);
        log.info("SaveUser => id: {}", user.getId());
    }

    @Override
    @CachePut(key = "#user.id")
    public User updateUser(User user) {
        if (null == user.getId() || cacheUsers.get(user.getId()) == null) {
            throw new RuntimeException("User not exist");
        }
        cacheUsers.put(user.getId(), user);
        log.info("UpdateUser => id: {}", user.getId());
        return user;
    }

    @Override
    @Cacheable(key = "#id", unless = "#result == null")
    public User getById(Long id) {
        log.info("getById => id: {}", id);
        return cacheUsers.get(id);
    }

    @Override
    @CacheEvict(key = "#id")
    public void removeUser(Long id) {
        if (cacheUsers.containsKey(id)) {
            cacheUsers.remove(id);
            log.info("RemoveUser => id: {}", id);
        } else {
            log.info("RemoveUser failed: id {} not exist!", id);
        }
    }


}
