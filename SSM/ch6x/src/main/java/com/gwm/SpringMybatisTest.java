package com.gwm;

import com.gwm.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * 使用XML文件配置Bean（userController），注入到Spring的容器当中去。
 */
public class SpringMybatisTest {
    public static void main(String[] args) {
        //使用xml文件加载Bean，注意要配置好<bean>
        ApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserController uc = (UserController) appCon.getBean("userController");
        uc.hello();
    }
}
