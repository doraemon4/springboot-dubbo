package com.stephen.learning.api;

import com.stephen.learning.model.User;

import java.util.List;

/**
 * @Auther: jack
 * @Date: 2018/11/3 11:09
 * @Description:
 */
public interface UserService {
    /**
     * 查询所有用户信息
     * @return
     */
    List<User> selectAllUsers();
}
