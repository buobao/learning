package com.turman.learning.service;

import com.turman.learning.entity.User;
import com.turman.learning.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User getUserInfo(int id) {
        return userMapper.getUserInfo(id);
    }

    public int deleteById(int id) {
        return userMapper.deleteById(id);
    }

    public int update(User user) {
        return userMapper.update(user);
    }

    public User save(User user) {
        int save = userMapper.save(user);
        if (save > 0) {
            return user;
        } else {
            return null;
        }
    }

    public List<User> getAll() {
        return userMapper.getAll();
    }

    public List<User> getUserByPage() {
        return userMapper.getAll();
    }
}
