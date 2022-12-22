package com.gwm.service.impl;


import com.gwm.pojo.User;
import com.gwm.service.UserService;

import java.util.ArrayList;

public class UserServiceImpl implements UserService {
    private  static ArrayList<User> users = new ArrayList<User>();
    @Override
    public boolean addUser(User u) {
        //不让添加名称为ming的用户
        if(!(u.getUserName()=="ming")){
            users.add(u);
            return true;
        }
        return false;
    }

    @Override
    public ArrayList<User> printUsers() {
        return users;
    }
}
