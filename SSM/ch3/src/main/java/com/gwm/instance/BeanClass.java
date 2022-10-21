package com.gwm.instance;

public class BeanClass {
    public String message;

    public BeanClass() {
        message = "通过构造方法实例化BeanClass,调用的是BeanClass的无参构造方法";
        System.out.println("BeanClass无参的构造方法调用中···");
    }

    public BeanClass(String s) {
        message = s;
    }
}
