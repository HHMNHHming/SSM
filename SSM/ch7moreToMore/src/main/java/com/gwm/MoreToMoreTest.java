package com.gwm;

import com.gwm.controller.MoreToMoreController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MoreToMoreTest {
    public static void main(String[] args) {
        ApplicationContext appCon  = new ClassPathXmlApplicationContext("applicationContext.xml");
        MoreToMoreController mtmc = (MoreToMoreController) appCon.getBean("moreToMoreController");
        mtmc.moreToMoreTest();
    }
}