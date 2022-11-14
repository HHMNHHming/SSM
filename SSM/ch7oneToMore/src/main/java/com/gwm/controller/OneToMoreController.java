package com.gwm.controller;

import com.gwm.dao.OrdersDao;
import com.gwm.dao.UserDao;
import com.gwm.po.Orders;
import com.gwm.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class OneToMoreController {
    @Autowired
    private UserDao userDao;
    @Autowired
    private OrdersDao ordersDao;
    public void oneToMoreTest(){
        //这里通过用户的id去查他购买的东西，一对多的关系，并且这个是执行了两次语句
        //多次访问数据库，会带来访问时间过长的问题。如果想要改进，可以使用连表查询。一个语句  结果用resMap接下来,或者使用实体类都可
        User user = userDao.selectUserOrdersById(1);
        System.out.println(user);

       /* List<Orders> list = ordersDao.selectOrdersById(1);
        System.out.println(list);*/

    }
}
