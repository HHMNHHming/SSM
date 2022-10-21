package com.gwm.instance;

public class BeanInstanceFactory {
    public BeanClass createBeanClassInstance(){
        return new BeanClass("通过实例工厂方法实例化BeanClass");
    }
}
