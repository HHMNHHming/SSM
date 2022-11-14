package com.gwm.dao;

import com.gwm.po.Orders;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrdersDao {
    public List<Orders> selectAllOrdersAndProducts();
}
