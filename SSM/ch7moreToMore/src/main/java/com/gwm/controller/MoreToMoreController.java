package com.gwm.controller;

import com.gwm.dao.OrdersDao;
import com.gwm.po.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class MoreToMoreController {
    @Autowired
    private OrdersDao ordersDao;
    public void moreToMoreTest(){
        List<Orders> list = ordersDao.selectAllOrdersAndProducts();
        for(Orders order:list){
            System.out.println(order);
        }
    }
}
