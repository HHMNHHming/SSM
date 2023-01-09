package com.gwm.controller;

import com.gwm.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {

    //登录界面
    @RequestMapping("/toLogin")
    public String login(){
        return "login";
    }

    //处理登录,用户身份验证
    @RequestMapping("/login")
    public String toLogin(User user, Model model, HttpSession session){
        if("xiaoming".equals(user.getUname())
        &&"123456".equals(user.getUpwd())){
            session.setAttribute("user",user);
            return "redirect:main";
        }
        model.addAttribute("msg","用户名或密码错误，请重新登录");
        return "login";
    }

    //登录成功，跳转到主页面 main
    @RequestMapping("/main")
    public String toMain(){
        return "main";
    }

    //退出登录
    @RequestMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "logout";
    }
}
