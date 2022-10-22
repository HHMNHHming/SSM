package com.gwm.test;

import com.gwm.CglibProxy;
import com.gwm.cglib.OnlyClass;

public class CglibProxyTest {
    public static void main(String[] args){
        //1、声明cglib动态代理的类cglibProxy
        CglibProxy cglibProxy = new CglibProxy();
        //2、声明被代理的对象
        OnlyClass onlyClass = new OnlyClass();
        //3、传参
        OnlyClass onlyClassAdvice = (OnlyClass) cglibProxy.createProxy(onlyClass);
        //4、使用代理对象的方法   查看代理对象是否真的被代理了！！
        onlyClassAdvice.save();
        System.out.println("===============");
        onlyClassAdvice.modify();
        System.out.println("===============");
        onlyClassAdvice.delete();
    }
}
