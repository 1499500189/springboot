package com.wzp.springboot.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.wzp.springboot.service.StudentService;
import org.springframework.stereotype.Component;
@Component
@Service(interfaceClass =StudentService.class,version = "1.0.0",timeout = 1533)
public class StudentServiceImpl implements StudentService {
    @Override

    public Integer queryByAll(Integer id) {
        return 1099;
    }
}
