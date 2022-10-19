package com.gwm.dao;
import com.gwm.po.Idcard;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository("IdCardDao")
//IdCardDao是直接对应数据库的一个实体类
@Mapper
public interface IdCardDao {
    public Idcard selectCodeById(int id);
}
