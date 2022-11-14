package com.gwm;

import com.gwm.controller.MoreToMoreController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//取这个名为了和上面那个主函数区分。不要和主函数的一样
public class ToMoreTest {

    @Test
    public void test(){
        System.out.println("你好中国");
        ApplicationContext appCon  = new ClassPathXmlApplicationContext("applicationContext.xml");
        MoreToMoreController mtmc = (MoreToMoreController) appCon.getBean("moreToMoreController");
        mtmc.moreToMoreTest();

    }
}
