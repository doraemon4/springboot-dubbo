package com.stephen.learning.controller;

import com.stephen.learning.api.UserService;
import com.stephen.learning.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther: jack
 * @Date: 2018/11/3 11:52
 * @Description:
 */
@RestController
@RequestMapping("/user")
public class Usercontroller {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/queryAll",method = RequestMethod.GET)
    public List<User> queryAll(){
        return userService.selectAllUsers();
    }
}
