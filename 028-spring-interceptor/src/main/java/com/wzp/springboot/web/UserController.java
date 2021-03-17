package com.wzp.springboot.web;

import com.wzp.springboot.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
@RequestMapping(value = "/user")
@Controller
public class UserController {

    @RequestMapping(value = "/login")
    public @ResponseBody Object Login(HttpServletRequest request){
        User user = new User();
        user.setId(11);
        user.setName("lisi");
        request.getSession().setAttribute("user",user);
        return "login Success";
    }
    @RequestMapping(value = "/center")
    public @ResponseBody Object  center(){

        return "see";

    }

    @RequestMapping(value = "/out")
    public  @ResponseBody Object out(){
        return "不用登录";
    }
    @RequestMapping(value = "error")
    public  @ResponseBody Object error(){
        return "error";
    }
}
