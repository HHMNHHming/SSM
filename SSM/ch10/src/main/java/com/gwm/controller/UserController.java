package com.gwm.controller;

import com.gwm.pojo.UserForm;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {
    private static final Log logger = LogFactory.getLog("UserController.class");
    @RequestMapping("login")
    public String login(UserForm user, HttpSession httpSession, Model model){
        if("zhangsan".equals(user.getUname())
            &&"123456".equals(user.getUpass())){
            //将后端的实体类对象，通过session传送给前端
            httpSession.setAttribute("u",user);
            logger.info(user.getUname()+"登录成功");
            return "main";
        }
        else{
            logger.info("登录失败");
            model.addAttribute("messageError","用户名或者密码错误");
            return "login";
        }
    }

    @RequestMapping("/register")
    public String register(UserForm userForm,Model model){
        if("zhangsan".equals(userForm.getUname())
            &&"123456".equals(userForm.getUpass())){
            logger.info(userForm.getUname()+"注册成功");
            return "login";
        }
        else{
            logger.info("注册失败");
            model.addAttribute("uname",userForm.getUname());
            return "register";
        }
    }
}
