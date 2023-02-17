package com.gwm.dao;

import com.gwm.po.MyUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userDao")
@Mapper
/** spring扫描mybatis的接口并自动装配，说白了就是扫描到spring容器中呗**/
public interface UserDao {
    public List<MyUser> selectMyUserByUname(MyUser myUser);
}
