package com.gwm.test;

import com.gwm.dao.TestDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    //使用主函数测试
    public static void main(String[] args){
        ApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext.xml");
        //test是applicationContext.xml配置文件中的id，getBean方法获取的是一个实现类的对象
        TestDao tt = (TestDao) appCon.getBean("test");
        System.out.println(appCon.getBean("test").getClass().getSimpleName());
        tt.sayHello();
    }


    //单纯使用spring写单元测试比较麻烦，建议使用springBoot的Junit测试
/*    @Test
    public void test(){
        System.out.println("这是一个测试用例···");
    }*/
}
