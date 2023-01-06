package com.gwm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("/goTest")
    public String goTest(){
        System.out.println("拦截器的请求方法正在执行中···");
        return "goTest";
    }

}
