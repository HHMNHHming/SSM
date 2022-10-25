package com.gwm.service;

import com.gwm.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    public int insert(String sql,Object args[]);

    public List<User> query(String sql,Object args[]);
}
