package com.wzp.controller;
import com.wzp.wkcto.model.User;
import com.wzp.wkcto.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class MyController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/user")
    public  String User(Model model, Integer id) {
        User user = userService.queryById(id);
        System.out.println("user===+==+++++++++++++++++++++++++++++++++++=" +user.getId()+user.getName());
        model.addAttribute("user",user);
        model.addAttribute("11",122);
        System.out.println("id 的值"+id);
        return   "/userDetail.jsp" ;
    }

}
