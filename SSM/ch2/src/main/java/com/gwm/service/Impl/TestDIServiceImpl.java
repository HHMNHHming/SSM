package com.gwm.service.Impl;

import com.gwm.dao.TestDIDao;
import com.gwm.service.TestDIService;

public class TestDIServiceImpl implements TestDIService {
    private TestDIDao testDIDao;

    //使用构造方法实现依赖注入    这个代码中最重要的一个方法
    //使用构造方法将TestDIDao当做属性注入进去
    public TestDIServiceImpl(TestDIDao testDIDao){
        this.testDIDao = testDIDao;
    }
    public void sayHello(){
        //调用TestDIDao中的方法   这里的testDIDao是引用类型的属性
        testDIDao.sayHello();
        System.out.println("这是TestDIService中的sayHello方法");
    }
}
