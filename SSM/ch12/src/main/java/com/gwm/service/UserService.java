package com.gwm.service;

import com.gwm.pojo.User;

import java.util.ArrayList;

public interface UserService {
    public boolean addUser(User u);
    public ArrayList<User> printUsers();
}
