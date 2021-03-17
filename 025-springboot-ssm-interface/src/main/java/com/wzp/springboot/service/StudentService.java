package com.wzp.springboot.service;

import com.wzp.springboot.model.Student;

public interface StudentService {
    Student queryStudentById(Integer id);

    Integer queryStudentAll();

}
