package com.gwm.life;

public class BeanLife {
    public void initLife(){
        System.out.println(this.getClass().getSimpleName()+"执行Bean自定义的初始化方法");
    }
    public void destroyLife(){
        System.out.println(this.getClass().getSimpleName()+"执行Bean自定义的销毁方法");
    }
}
