package com.gwm.service;

import com.gwm.po.MyUser;

import java.util.List;

public interface UserService {
    List<MyUser> selectMyUserByUname(MyUser myUser);
}
