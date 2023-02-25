package tech.alexchen.springboot.cache.service;

import tech.alexchen.springboot.cache.entity.User;

/**
 * @author alexchen
 */
public interface UserService {

    void saveUser(User user);

    User updateUser(User user);

    User getById(Long id);

    void removeUser(Long id);
}
