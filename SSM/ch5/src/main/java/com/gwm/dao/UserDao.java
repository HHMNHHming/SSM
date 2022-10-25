package com.gwm.dao;
import com.gwm.entity.User;
import java.util.List;

public interface UserDao {
    public int insert(String sql, Object args[]);
    public List<User> query(String sql,  Object args[]);

}
