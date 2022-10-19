package com.gwm.dao;

import com.gwm.po.Person;
import com.gwm.pojo.SelectPersonById;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
//spring的注解repository
@Repository("personDao")
//用于生成dao实现类的Mapper注解
@Mapper
public interface PersonDao {
    //使用嵌套查询，会执行两个sql语句
    public Person selectPersonById1(Integer id);
}
