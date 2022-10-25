package com.gwm.dao.Impl;

import com.gwm.dao.UserDao;
import com.gwm.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
//注意这里的包写的RowMapper包不要导入错误
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;


import java.util.List;


@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int insert(String sql, Object[] args) {
        return jdbcTemplate.update(sql,args);
    }

    @Override
    public List<User> query(String sql, Object[] args) {
        RowMapper<User> rowMapper = new BeanPropertyRowMapper<User>(User.class);
        return jdbcTemplate.query(sql,rowMapper,null);
    }
}
