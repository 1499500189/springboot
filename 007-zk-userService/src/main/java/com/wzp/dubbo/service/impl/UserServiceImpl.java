package com.wzp.dubbo.service.impl;

import com.wzp.dubbo.model.User;
import com.wzp.dubbo.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public User queryById(Integer id) {
        User user  =  new User();
        user.setName("wangwu");
        user.setId(id);

        return user;
    }
}
