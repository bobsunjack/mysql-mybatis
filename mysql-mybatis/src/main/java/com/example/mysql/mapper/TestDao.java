package com.example.mysql.mapper;

import com.example.mysql.domain.Alarmrecord;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface TestDao {
    @Select("Select * from alarmjointarget where id=#{orgId} ")
    Alarmrecord findById(@Param("orgId") String orgId);
}
