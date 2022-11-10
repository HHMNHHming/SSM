package com.gwm;

import com.gwm.controller.OneToOneController;
import com.gwm.service.ServiceTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestOneToOne {

    public static void main(String[] args){
        ApplicationContext appCon = new AnnotationConfigApplicationContext("com.gwm.service");
        //OneToOneController oto = (OneToOneController) appCon.getBean("oneToOneController");
        //oto.test();

        ServiceTest st = (ServiceTest) appCon.getBean("serviceTest");
        st.test();
    }
}