package com.wzp.dubbo.service.impl;

import com.wzp.dubbo.model.User;
import com.wzp.dubbo.service.UserService;

public class UserServiceImpl implements UserService {

    @Override
    public User queryUserById(Integer id) {
        User user = new User();
        user.setAge(23);
        user.setId(1001);
        user.setName("zl");

        return user;
    }
}
