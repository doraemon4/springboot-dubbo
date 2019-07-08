package com.stephen.learning.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.stephen.learning.api.UserService;
import com.stephen.learning.model.User;
import io.swagger.annotations.ApiOperation;
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
    @Reference(version="1.0.0")
    private UserService userService;

    @ApiOperation(value="获取用户详细信息", notes="获取用户详细信息")
    @RequestMapping(value = "/queryAll",method = RequestMethod.GET)
    public List<User> queryAll(){
        return userService.selectAllUsers();
    }
}
