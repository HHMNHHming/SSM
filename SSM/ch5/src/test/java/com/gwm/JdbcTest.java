package com.gwm;

import com.gwm.dao.UserDao;
import com.gwm.entity.User;
import com.gwm.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class JdbcTest {
    public static void main(String[] args) {
        //先获取应用上下文  获取配置文件中的Bean配置
        ApplicationContext appCon = new ClassPathXmlApplicationContext("springJdbc.xml");
        //声明Bean（UserDao）
        UserDao userDao = (UserDao) appCon.getBean("userDao");
        //声明Bean（UserService）
        UserService userService = (UserService) appCon.getBean("userService");

/*
        //最简单的直接插入法
        String insertSql = "insert into User values(null,?,?) ";
        Object param[] = {"zhangsan","男"};
        int x = userDao.update(insertSql,param);
        if(x>0){
            System.out.println("插入数据成功···");
        }
        else{
            System.out.println("插入数据失败···");
        }
*/
        //为了模拟实际应用中处理复杂的逻辑关系，使用service层中的方法  起始我们这里只有一个拿数据的操作 直接调用dao层的方法也是可以的
        //查询数据一定要保证自己的数据库里面有数据才可以！
        String selectSql = "select * from User";
        List<User> userList = userService.query(selectSql, null);
        //System.out.println(userList);
        for (User user : userList) {
            System.out.println(user);
            //System.out.println(user.getNumber().length());
        }
        String insertSql = "insert into User values(null,?,?,?) ";
        Object param[] = {"xiaoming", "男", "1832065"};
        String selectNumSql = "select * from User where number = '1832065'";
        //没有查到同number的数据  确保唯一性
        if (userService.query(selectNumSql, args).size() <= 0) {
            int num = userService.insert(insertSql, param);
            if (num > 0) {
                System.out.println("插入数据成功···");
            } else {
                System.out.println("插入操作执行失败导致插入数据失败···");
            }
        }
        else{
            System.out.println("数据中number不能重复导致插入数据失败···");
        }

    }
}
