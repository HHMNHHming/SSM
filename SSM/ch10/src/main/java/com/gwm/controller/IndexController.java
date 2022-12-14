package com.gwm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @Controller默认将类注入到容器里面
 */
@Controller
@RequestMapping("/index")
public class IndexController {

    @RequestMapping("/hello")
    public void hello(){
        System.out.println("hello");
    }

    @RequestMapping("/login")
    public String login(HttpSession httpSession, HttpServletRequest request){
        httpSession.setAttribute("sKey","session的值");
        request.setAttribute("rKey","request的值");
        return "login";
    }

    @RequestMapping("/register")
    public String register(){
        return "register";
    }

}
