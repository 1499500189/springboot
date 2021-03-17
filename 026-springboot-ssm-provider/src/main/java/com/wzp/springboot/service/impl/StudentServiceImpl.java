package com.wzp.springboot.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.wzp.springboot.mapper.StudentMapper;
import com.wzp.springboot.model.Student;
import com.wzp.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
@Service(interfaceClass = StudentService.class,version = "1.0.0",timeout = 15000)
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private RedisTemplate<Object,Object> redisTemplate;

    @Override
    public Student queryStudentById(Integer id) {


        return studentMapper.selectByPrimaryKey(id);
    }

    @Override
    public Integer queryStudentAll() {
        Integer  allStudentCount = (Integer) redisTemplate.opsForValue().get("allStudentCount");
        System.out.println("之前"+allStudentCount);
        if (null==allStudentCount){
               allStudentCount = studentMapper.selectAllStudentCount();
            System.out.println(allStudentCount);
               redisTemplate.opsForValue().set("allStudentCount",allStudentCount,15, TimeUnit.HOURS);


        }

        return allStudentCount;
    }
}
