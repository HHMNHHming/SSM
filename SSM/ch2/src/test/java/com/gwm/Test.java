package com.gwm;

import com.gwm.dao.TestDIDao;
import com.gwm.service.TestDIService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        ApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext.xml");
        //直接调用Test的sayHello方法
        TestDIDao testDIDao = (TestDIDao) appCon.getBean("myTestDIDao");
        testDIDao.sayHello();

        System.out.println("------------------------------");

        //调用TestDIService的sayHello方法
        TestDIService testDIService = (TestDIService) appCon.getBean("testDIService");
        testDIService.sayHello();
    }
}
