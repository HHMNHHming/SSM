package com.gwm;

import com.gwm.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * 这个ComponentScan不能用大概是因为使用的Spring容器的上下文？ 不能用上下文appCon来获取容器中的Bean？ 暂时搁置一下吧！！
 * 2022-10-28 终于弄清楚了为什么@ComponnetScan为什么不能用了
 * 1> @ComponentScan之前要先有@Component（组件只能去标记类，不能标记接口）
 * 2> ApplicationContext上下文调用Bean有不同的调用方法
 */

//注解扫描实现扫描Bean （@Component）
@ComponentScan(basePackages = "com.gwm")
public class MybatisSpringTest {
    public static void main(String[] args) {

        //使用XML文件实现Bean装配
/*        ApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserController uc = (UserController) appCon.getBean(UserController.class);
        uc.test();*/

        //使用注解的实现Bean装配
        //这里只是把service包及子包的文件，加载到Spring上下稳文中 而且ServiceTest是一个类
        ApplicationContext appCon2 = new AnnotationConfigApplicationContext("com.gwm.service");
        UserService us = appCon2.getBean(UserService.class);
        us.serviceTest();
    }
}