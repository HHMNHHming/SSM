package com.gwm;

import com.gwm.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.annotation.Resource;
import java.io.InputStream;
import java.util.List;

public class MyBatisTest {
    public static void main(String[] args) {
        try{
            //读取配置文件mybatis-config.xml
            InputStream config = Resources.getResourceAsStream("mybatis-config.xml");
            //构建SqlSessionFactory
            SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(config);
            SqlSession ss = ssf.openSession();
            //SqlSession 执行映射文件中定义的sql，并返回映射结果

            //查
            User u = ss.selectOne("com.gwm.mapper.UserMapper.selectUserById",1);
            System.out.println(u);
            //增
            User user = new User();
            user.setName("wangxiaoming");
            user.setSex("女");
            user.setNumber("183206255");
            ss.insert("com.gwm.mapper.UserMapper.addUser",user);
            //改
            user.setNumber("183206222");
            ss.update("com.gwm.mapper.UserMapper.updateUser",user);
            //删
            ss.delete("com.gwm.mapper.UserMapper.deleteUser",user);

            //查询所有的User
            List<User> list = ss.selectList("com.gwm.UserMapper.selectAllUser");
            for(Object euser :list) {
                System.out.println(euser);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
