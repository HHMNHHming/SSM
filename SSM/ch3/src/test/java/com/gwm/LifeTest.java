package com.gwm;

import com.gwm.life.BeanLife;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 前面两个打印  是因为加载配置文件的原因···
 */
public class LifeTest {
    public static void main(String[] args) {
        //这里使用ClassPathXmlApplicationContext 方便后面调用后面销毁方法
        ClassPathXmlApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("获取BeanLife对象之前");
        BeanLife beanLife = (BeanLife) appCon.getBean("beanLife");
        //这里注意实例化、初始化对象以后一定要 使用 该对象，使用该对象是为了模拟Bean的声明周期
        System.out.println("获取BeanLife对象之后"+beanLife);
        appCon.close();




        //Bean生命周期大致分为四个阶段: 实例化、初始化、使用、创建四个阶段
        //在加载xml文件时，已经是执行了Bean实例化 初始化的阶段。输出beanLife时模拟使用Bean过程，关闭文件模拟销毁过程。
    }
}