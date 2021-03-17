package com.wzp.springboot.web;

import com.wzp.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

 @RequestMapping(value = "/student")
 @ResponseBody
    public  String   student(){
      Integer allCount=        studentService.queryAllCount();



     return "学生的总人数"+allCount;
 }



}
