package com.example.mysql.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.example.mysql.mapper.AlarmjointargetMapper;
import com.example.mysql.domain.Alarmjointarget;

@Service
public class AlarmjointargetService {

    @Resource
    private AlarmjointargetMapper alarmjointargetMapper;


    public int deleteByPrimaryKey(String id) {
        return alarmjointargetMapper.deleteByPrimaryKey(id);
    }


    public int insert(Alarmjointarget record) {
        return alarmjointargetMapper.insert(record);
    }


    public int insertSelective(Alarmjointarget record) {
        return alarmjointargetMapper.insertSelective(record);
    }


    public Alarmjointarget selectByPrimaryKey(String id) {
        return alarmjointargetMapper.selectByPrimaryKey(id);
    }


    public int updateByPrimaryKeySelective(Alarmjointarget record) {
        return alarmjointargetMapper.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(Alarmjointarget record) {
        return alarmjointargetMapper.updateByPrimaryKey(record);
    }

}

