package com.wzo.dubbo.service.impl;

import com.wzp.dubbo.model.User;
import com.wzp.dubbo.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public User queryById(Integer id) {
        User user =new User();
        user.setId(id);
        user.setName("zlssb");
        return user;
    }
}
