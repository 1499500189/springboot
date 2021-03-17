package com.wzp.dubbo.controller;

import com.wzp.dubbo.model.User;
import com.wzp.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user")
    public String    userDetail(Integer id, Model model){
        User user = userService.queryById(id);
        model.addAttribute("user",user);
        System.out.println("user" +user.getName()+user.getId());

        return "/userDetail.jsp";
    }
}
