package com.stephen.learning.service;

import com.stephen.learning.api.UserService;
import com.stephen.learning.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: jack
 * @Date: 2018/11/3 11:29
 * @Description:
 */
public class UserServiceImpl implements UserService {
    @Override
    public List<User> selectAllUsers() {
        List<User> users=new ArrayList<>();
        users.add(User.builder().name("jack").sex("male").age(25).email("324364678@qq.com").build());
        users.add(User.builder().name("jack").sex("male").age(25).email("324364678@qq.com").build());
        users.add(User.builder().name("jack").sex("male").age(25).email("324364678@qq.com").build());
        users.add(User.builder().name("jack").sex("male").age(25).email("324364678@qq.com").build());
        users.add(User.builder().name("jack").sex("male").age(25).email("324364678@qq.com").build());
        return users;
    }
}
