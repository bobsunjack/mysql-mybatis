package com.example.mysql.mapper;

import com.example.mysql.domain.UserTest;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserTestMapper {
    int deleteByPrimaryKey(String id);

    int insert(UserTest record);

    int insertSelective(UserTest record);

    UserTest selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(UserTest record);

    int updateByPrimaryKey(UserTest record);
}