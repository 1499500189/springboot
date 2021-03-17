package com.wzp.wkcto.service;

import com.wzp.wkcto.model.User;

public interface UserService {
    User  queryById(Integer id);
    Integer  queryUserAllCount();

}
