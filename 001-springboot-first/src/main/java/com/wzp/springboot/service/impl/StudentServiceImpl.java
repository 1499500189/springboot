package com.wzp.springboot.service.impl;

import com.wzp.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private RedisTemplate<Object,Object>  redisTemplate;
    @Override
    public void put(String key, String value) {
        System.out.println(key);
        System.out.println(value);
        redisTemplate.opsForValue().set(key,value);

    }

    @Override
    public String get(String value) {
        String id  = (String) redisTemplate.opsForValue().get(value);
        return id  ;
    }
}
