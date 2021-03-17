package com.wzp.springboot.Controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wzp.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {
    @Reference(interfaceClass = StudentService.class,version = "1.0.0",check = false)
    private StudentService studentService;

    @RequestMapping(value = "/way")
    public  @ResponseBody Integer way(Integer id){

        Integer   all      =studentService.queryByAll(id);


        return all;
    }
}
