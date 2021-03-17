package com.wzo.dubbo.controller;

import com.wzp.dubbo.model.User;
import com.wzp.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController  {

    @Autowired
    private UserService   userService;
    @Autowired
    private  UserService userService2;

    @RequestMapping(value = "/user")
    public String user(Integer id, Model model){
        User user = userService.queryById(id);
        User user1 = userService2.queryById(id);


        model.addAttribute("user",user);
        model.addAttribute("user1",user1);




        return  "/userDetail.jsp";
    }

}
