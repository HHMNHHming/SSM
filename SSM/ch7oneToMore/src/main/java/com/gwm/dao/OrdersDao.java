package com.gwm.dao;

import com.gwm.po.Orders;
import com.gwm.po.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrdersDao {
    public List<Orders> selectOrdersById(Integer id);
}
