package com.gwm.instance;

import org.springframework.context.annotation.Bean;

public class BeanStaticFactory {

    //声明成员变量BeanClass 创建这个BeanClass调用的是有参的构造方法
    private static BeanClass beanClass = new BeanClass("通过静态工厂方法实例化BeanClass");
    public static BeanClass createBeanClass(){
        return beanClass;
    }
}
