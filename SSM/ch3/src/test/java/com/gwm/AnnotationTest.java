package com.gwm;

import com.gwm.annotation.AnnotationUser;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTest {
    public static void main(String[] args){
        //使用注解装配的时候不知道为什么加了aop的jar
        ApplicationContext appCon = new ClassPathXmlApplicationContext("annotationContext.xml");
        AnnotationUser annotationUser = (AnnotationUser) appCon.getBean("annotationUser");
        System.out.println("annotationUser的实例的名字:"+annotationUser.getName());
    }
}
