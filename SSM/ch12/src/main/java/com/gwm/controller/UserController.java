package com.gwm.controller;

import com.gwm.pojo.User;
import com.gwm.service.UserService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.DelegatingWebMvcConfiguration;

import java.util.ArrayList;
import java.util.HashMap;


@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired UserService userService;
    private static final Log logger = LogFactory.getLog("UserController.class");
    @RequestMapping("/inputUser")
    public String inputUser(Model model){
        //使用SpringContext的ui下的Model接口
        HashMap<String,String> hobby =new HashMap<String,String>();
        hobby.put("篮球","篮球");
        hobby.put("乒乓球","乒乓球");
        hobby.put("足球","足球");
        model.addAttribute("user",new User());
        model.addAttribute("hobbys",hobby);
        model.addAttribute("carrers",new String[] {"教师","学生","coding搬运工","其他"});
        model.addAttribute("houseRegister",new String[] {"北京","上海","深圳","广州","其他"});

        return "addUser";
//        if(userService.addUser(u)){
//            return "添加成功";
//        }
//        else {
//            return "添加失败";
//        }
    }
    @RequestMapping("/addUser")
    public String addUser(@ModelAttribute User user, Model model){
        if(userService.addUser(user)){
            logger.info("添加成功");
        }
        else{
            logger.info("添加失败");
        }
        HashMap<String,String> hobby =new HashMap<String,String>();
        hobby.put("篮球","篮球");
        hobby.put("乒乓球","乒乓球");
        hobby.put("足球","足球");
        model.addAttribute("hobbys",hobby);
        model.addAttribute("carrers",new String[] {"教师","学生","coding搬运工","其他"});
        model.addAttribute("houseRegister",new String[] {"北京","上海","深圳","广州","其他"});

        return "addUser";
    }
    @RequestMapping("/list")
    public String usersList(Model model){
        ArrayList<User> users = userService.printUsers();
        model.addAttribute("users",users);
        return "userList";
    }
}
