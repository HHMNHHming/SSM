package com.gwm;

import com.gwm.instance.BeanClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 第三章第一个测试用例（三种实例化方式），本来是只有BeanClass类创建
 * 但是由于写到下面  把所有的配置都写到了applicationContext中 “BeanLife执行Bean自定义的初始化方法”
 */
public class InstanceTest {
    public static void main(String[] args){
        //获取配置文件xml
        ApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过构造方法实现实例化Bean
        BeanClass b1 = (BeanClass) appCon.getBean("constructorInstance");
        System.out.println(b1+b1.message);

        //通过静态工厂方法实例化Bean
        BeanClass b2 = (BeanClass) appCon.getBean("staticFactoryInstance");
        System.out.println(b2+b2.message);

        //通过实例工厂方法实例化Bean
        BeanClass b3 = (BeanClass) appCon.getBean("instanceFactoryInstance");
        System.out.println(b3+b3.message);
    }
}
