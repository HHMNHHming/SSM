package com.gwm.test;

import com.gwm.JdkProxy;
import com.gwm.jdk.TestDao;
import com.gwm.jdk.impl.TestDaoImpl;

public class JdkProxyTest {
    public static void main(String[] args){
        //1、声明jdk动态代理的类JdkProxy
        JdkProxy jdkProxy = new JdkProxy();
        //2、声明被代理的对象
        TestDao testDao  = new TestDaoImpl();
        //3、传参
        TestDao testDaoAdvice= (TestDao)jdkProxy.createProxy(testDao);
        //4、使用代理对象的方法   查看代理对象是否真的被代理了！！
        testDaoAdvice.save();
        System.out.println("===============");
        testDaoAdvice.modify();
        System.out.println("===============");
        testDaoAdvice.delete();
    }
}
