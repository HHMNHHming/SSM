package com.gwm.controller;

import com.gwm.dao.UserDao;
import com.gwm.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;


@Controller
public class UserController {
    @Autowired UserDao userDao;
    public void test(){
        //主要下面这些User  调用方法的时候可以自己改变
        System.out.println("==========");
        User user = new User();
        user.setId(2);
        user.setName("xiaofei");
        user.setSex("男");
        user.setNumber("183206219");
        userDao.addUser(user);
        System.out.println(user);
        System.out.println("==========");

        System.out.println("查询一个用户");
        userDao.selectUserById(2);
        System.out.println("==========");

        System.out.println("修改一个用户");
        user.setId(3);
        userDao.updateUser(user);
        System.out.println("==========");

        System.out.println("删除一个用户");
        userDao.deleteUser(3);
        System.out.println("==========");

        System.out.println("查询所有的用户");
        List<User> list = userDao.selectAllUser();
        for(User auser:list){
            System.out.println(auser);
        }

    }
}
