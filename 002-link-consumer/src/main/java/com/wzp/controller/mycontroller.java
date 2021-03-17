package com.wzp.controller;

import com.wzp.dubbo.model.User;
import com.wzp.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class mycontroller {
    @Autowired
    private UserService userService;

    @RequestMapping(value="/way")
    public  String way(Model model,Integer id) {
        User user = userService.queryUserById(id);
        model.addAttribute("user",user);

           return   "/002/userDetail.jsp" ;
    }
}
