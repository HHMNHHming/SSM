package com.gwm.dao;

import com.gwm.po.Person;
import com.gwm.pojo.SelectPersonById;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
//Spring的注解repository
//@Repository("personDao")
//用于生成dao实现类的Mapper注解
   //这句话非常的重要！！！  这里的dao接口，是通过mybatis注入到Spring容器来管理的，而不是注解。
@Mapper
public interface PersonDao {
    //使用嵌套查询，会执行两个sql语句
    public Person selectPersonById1(Integer id);
}
