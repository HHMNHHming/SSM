package com.gwm.controller;

import com.gwm.pojo.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@RestController=@Controller+@ResponseBody 注解
@RestController
public class TestController {
    @RequestMapping("/testJson")

    public Person testJson(@RequestBody Person p){
        System.out.println("姓名:"+p.getPname() +
                            " 年龄:"+p.getPage());
        return p;
    }

    @RequestMapping("test")
    public String test(){
        System.out.println("test");
        return "test";
    }

}
