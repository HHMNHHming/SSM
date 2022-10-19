package com.gwm.controller;

import com.gwm.dao.PersonDao;
import com.gwm.po.Person;
import com.gwm.pojo.SelectPersonById;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("oneToOneController")
public class OneToOneController {
    @Autowired
    private PersonDao personDao;

    public void test() {
        Person p1 = personDao.selectPersonById1(1);
        System.out.println(p1);
    }
}
