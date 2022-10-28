package com.gwm;

import com.gwm.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 这这个ComponentScan不能代替Component:scan用大概是因为使用的Spring容器的上下文？ 不能用上下文appCon来获取容器中的Bean？ 暂时搁置一下吧！！
 * 总而言之还是不懂Component注解的用法
 *
 * 这里我还是使用的XML文件的方式实例化Bean  这里调用了controller dao mybatis po 还有那个配置文件
 */

//@ComponentScan(basePackages = {"com.gwm.controller","com.gwm.dao"})
public class Test {
    public static void main(String[] args) {
        ApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserController uc = (UserController) appCon.getBean("userController");
        uc.test();
    }
}
