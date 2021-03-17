package com.wzp.wkcto.dubbo.service.impl;

import com.wzp.wkcto.model.User;
import com.wzp.wkcto.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public User queryById(Integer id) {
        User user = new User();
        user.setId(11);
        user.setName("zhangsan");

        return user;
    }

    @Override
    public Integer queryUserAllCount() {
        return 53;
    }
}
