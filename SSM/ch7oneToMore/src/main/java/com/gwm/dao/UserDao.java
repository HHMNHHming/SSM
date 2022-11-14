package com.gwm.dao;


import com.gwm.po.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {
    public User selectUserById(Integer id);

    public List<User> selectAllUser();

    public int addUser(User user);

    public int updateUser(User user);

    public int deleteUser(Integer id);

    public User selectUserOrdersById(Integer id);
}
