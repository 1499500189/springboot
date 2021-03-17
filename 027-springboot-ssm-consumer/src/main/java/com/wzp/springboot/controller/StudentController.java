package com.wzp.springboot.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wzp.springboot.model.Student;
import com.wzp.springboot.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.awt.SunHints;


@Controller
public class StudentController {

    @Reference(interfaceClass = StudentService.class,version = "1.0.0",check = false)
    private StudentService studentService;

    @RequestMapping(value = "/student/detail/{id}")
    public  String studentDetail(Model model, @PathVariable("id") Integer id){
        System.out.println(id);
     Student student   =   studentService.queryStudentById(id);
     model.addAttribute("student",student);

        System.out.println(student.getId()+student.getAge()+student.getName());

    return "/studentDetail.jsp";
}
    @GetMapping(value = "/student/all/count")
    public  @ResponseBody Object count(){
          Integer all      =studentService.queryStudentAll();

        return all;
    }


}
