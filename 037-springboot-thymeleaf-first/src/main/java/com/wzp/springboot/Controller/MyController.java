package com.wzp.springboot.Controller;

import com.wzp.springboot.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MyController {



    @RequestMapping(value = "/user/detail")
    public   String userDetail(Model model){
        User user = new User();
        user.setId(1001);
        user.setName("zl");
        user.setAge(11);

        model.addAttribute("user",user);
        model.addAttribute("data","springboot第一个thymeleaf");
        model.addAttribute("id",99);
        model.addAttribute("age",11);
        model.addAttribute("name","liwu");


        return "message";
    }


    @RequestMapping(value = "/user/detail/1")
    @ResponseBody
    public   String userDetail1(Model model){
        User user = new User();
        user.setAge(99);
        user.setName("ww");
        user.setId(1011);



        return "第二个页面";
    }


    @RequestMapping(value = "/user")
    public   String user(Model model){
        User user = new User();
        user.setAge(99);
        user.setName("ww");
        user.setId(1011);
    model.addAttribute("id",99);
    model.addAttribute("age",11);
    model.addAttribute("name","liwu");


        return "message" ;
    }
    @RequestMapping(value = "/user/en")
    @ResponseBody
     public   String userAll(Integer id,Integer age,String name){




        return "最后返回的数值"+id+age+name ;
    }

   @RequestMapping(value = "each/list")
    public  String  eachList(Model model){

       List<User> userList = new ArrayList<>();
       for (int i=1;i<10;i++){
           User user = new User();
           user.setId(11);
           user.setName("zl");
           userList.add(user);
       }


model.addAttribute("userList",userList);




        return "no";
   }



   
}
