package com.wzp.springboot.controller;

import com.wzp.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @Autowired
    private StudentService studentService;



    @RequestMapping(value = "/put")
    @ResponseBody
    public  Object put(String key,String value){
                 studentService.put(key, value);

       return "zhifangru";
    }

    @RequestMapping(value = "/get")
    @ResponseBody
    public  Object get(String value){
         String ID  =   studentService.get(value);

        return ID;
    }





}
