package com.turman.learning.mapper;

import com.turman.learning.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    /**
     * 依据id查询用户信息
     * @param id
     * @return
     */
    User getUserInfo(int id);

    /**
     * 新增用户
     * @param user
     * @return
     */
    int save(User user);

    /**
     * 删除用户
     * @param id
     * @return
     */
    int deleteById(int id);

    /**
     * 更新用户信息
     * @param user
     * @return
     */
    int update(User user);

    /**
     * 获取用户列表
     * @return
     */
    List<User> getAll();
}
