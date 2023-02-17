package com.gwm.controller;

import com.gwm.dao.UserDao;
import com.gwm.po.MyUser;
import com.gwm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
public class UserController {
    @Autowired(required = false)
    private UserService userService;

    @RequestMapping("/select")
    public String selectMyUserByUname(MyUser myuser, Model model){
        List<MyUser> list=userService.selectMyUserByUname(myuser);
        for(MyUser myUser: list){
            System.out.println("数据库查出的:"+myUser.toString());
        }
        model.addAttribute("userList",list);
        return "userList";
    }
}
