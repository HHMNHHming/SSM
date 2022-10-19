package com.gwm.service.Impl;

import com.gwm.dao.TestDIDao;
import com.gwm.service.TestDIService;

public class TestDIServiceImpl2 implements TestDIService {
    private TestDIDao testDIDao;

    //使用属性setter方法注入
    public void setTestDIDao(TestDIDao testDIDao) {
        this.testDIDao = testDIDao;
    }
    public void sayHello(){
        testDIDao.sayHello();
        System.out.println("这是通过setter方法完成依赖注入的  TestDIService的sayHello方法");
    }
}
