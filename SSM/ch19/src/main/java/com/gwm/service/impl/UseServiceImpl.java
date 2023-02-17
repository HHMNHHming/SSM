package com.gwm.service.impl;

import com.gwm.dao.UserDao;
import com.gwm.po.MyUser;
import com.gwm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("userService")
//@Transactional
public class UseServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public List<MyUser> selectMyUserByUname(MyUser myUser) {
        return userDao.selectMyUserByUname(myUser);
    }
}
