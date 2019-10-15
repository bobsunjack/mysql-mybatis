package com.example.mysql.mapper;

import com.example.mysql.domain.Alarmrecord;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AlarmrecordMapper {
    int deleteByPrimaryKey(String id);

    int insert(Alarmrecord record);

    int insertSelective(Alarmrecord record);

    Alarmrecord selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Alarmrecord record);

    int updateByPrimaryKey(Alarmrecord record);
}