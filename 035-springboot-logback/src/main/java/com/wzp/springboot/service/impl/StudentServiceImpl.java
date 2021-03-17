package com.wzp.springboot.service.impl;

import com.wzp.springboot.mapper.StudentMapper;
import com.wzp.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Integer queryAllCount() {


        return studentMapper.selectAllCount();
    }
}
