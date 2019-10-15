package com.example.mysql.dao;

import com.example.mysql.domain.Alarmrecord;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface TestDao {
    @Select("Select * from alarmjointarget where id=#{orgId} ")
    Alarmrecord findById(@Param("orgId") String orgId);
}
