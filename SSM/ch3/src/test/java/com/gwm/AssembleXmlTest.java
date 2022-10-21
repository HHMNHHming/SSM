package com.gwm;

import com.gwm.assemble.ComplexUser;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AssembleXmlTest {
    public static void main(String[] args){
        //assemble 装配，组装
        ApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext.xml");

        //获取构造方法实现的complexUser实例
        ComplexUser complexUser = (ComplexUser) appCon.getBean("user");
        System.out.println(complexUser.toString());

        //获取setter方法实现的complexUser实例
        ComplexUser complexUser2 = (ComplexUser) appCon.getBean("user2");
        System.out.println(complexUser2.toString());
    }
}
