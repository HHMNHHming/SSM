package com.gwm;

import com.gwm.controller.OneToMoreController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OnToMoreTest {
    public static void main(String[] args) {
        ApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext.xml");
        OneToMoreController otm = (OneToMoreController) appCon.getBean("oneToMoreController");
        otm.oneToMoreTest();
    }
}