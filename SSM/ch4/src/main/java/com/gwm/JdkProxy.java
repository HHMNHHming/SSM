package com.gwm;

import com.gwm.aspect.MyAspect;
import com.gwm.jdk.TestDao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 使用jdk代理必须是实现InvocationHandler接口
 * 注意事项: 代理类不单单要拥有自己，还有拥有自己的接口。   也就是说jdk必须代理有接口的类
 */
public class JdkProxy implements InvocationHandler {
    //声明真实要被代理的接口对象
    private TestDao testDao;
    public Object createProxy(TestDao testDao){
        this.testDao=testDao;
        //1.类加载器
        ClassLoader cId = JdkProxy.class.getClassLoader();
        //2、被代理对象实现的所有接口
        Class[] clazz = testDao.getClass().getInterfaces();
        //3、使用代理类进行增强，返回代理的对象
        return Proxy.newProxyInstance(cId,clazz,this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        MyAspect myAspect = new MyAspect();
        myAspect.check();
        myAspect.expect();
        Object obj = method.invoke(testDao,args);
        myAspect.log();
        myAspect.monitor();
        return obj;
    }
}
