package com.gwm;

import com.gwm.aspect.MyAspect;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 注意这个接口 MethodInterceptor 是在core中的一个接口，在使用前必须导包
 */
public class CglibProxy implements MethodInterceptor {
    public Object createProxy(Object target){
        Enhancer enhancer = new Enhancer();
        //1.确定需要增强的类，设置其父类
        enhancer.setSuperclass(target.getClass());
        //2、确定为当前对象
        enhancer.setCallback(this);
        //3、返回被创建的代理对象
        return enhancer.create();
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        MyAspect myAspect = new MyAspect();
        myAspect.check();
        myAspect.expect();
        Object obj = methodProxy.invokeSuper(o,objects);
        myAspect.log();
        myAspect.monitor();
        return obj;
    }
}
