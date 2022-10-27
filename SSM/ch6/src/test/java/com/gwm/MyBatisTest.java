package com.gwm;

import com.gwm.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

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



            //数据库增删改查的基本操作   看数据库是怎么设计的   改的时候是通过什么对应的id还是number
 /*           //通过id去查User
            User u = ss.selectOne("com.gwm.mapper.UserMapper.selectUserById",1);
            System.out.println(u);
            //直接增加User对象
            User user = new User();
            user.setId(19);
            user.setName("wangxiaoming");
            user.setSex("女");
            user.setNumber("183");
            ss.insert("com.gwm.mapper.UserMapper.addUser",user);
            //通过id去修改一条数据  在sql语句中有体现
            user.setNumber("183206222");
            System.out.println("这个时候的User"+user);
            ss.update("com.gwm.mapper.UserMapper.updateUser",user);
            //删
            ss.delete("com.gwm.mapper.UserMapper.deleteUser",user.getId());
*/
            //查询所有的User
            List<User> list = ss.selectList("com.gwm.mapper.UserMapper.selectAllUser");
            //System.out.println(list);
            for(Object euser :list) {
                System.out.println(euser);
            }

            //提交事务
            ss.commit();
            //关闭事务
            ss.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
