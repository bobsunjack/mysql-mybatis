package com.example.mysql.mapper;
import com.example.mysql.domain.Alarmrecord;
import org.apache.ibatis.annotations.Param;

import com.example.mysql.domain.Alarmjointarget;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AlarmjointargetMapper {
    int deleteByPrimaryKey(String id);

    int insert(Alarmjointarget record);

    int insertSelective(Alarmjointarget record);

    Alarmjointarget selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Alarmjointarget record);

    int updateByPrimaryKey(Alarmjointarget record);

    Alarmjointarget findById(@Param("id")String id);

    @Select("Select * from alarmjointarget where id=#{orgId} ")
    Alarmjointarget findById2(@Param("orgId") String orgId);


}