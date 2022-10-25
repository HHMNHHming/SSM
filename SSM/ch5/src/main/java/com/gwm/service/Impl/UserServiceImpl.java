package com.gwm.service.Impl;

import com.gwm.dao.UserDao;
import com.gwm.entity.User;
import com.gwm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public int insert(String sql, Object[] args) {
       return userDao.insert(sql,args);
    }

    @Override
    public List<User> query(String sql, Object[] args) {
        return userDao.query(sql,args);
    }
}
