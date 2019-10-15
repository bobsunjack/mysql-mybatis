package com.example.mysql.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.example.mysql.mapper.AlarmrecordMapper;
import com.example.mysql.domain.Alarmrecord;
@Service
public class AlarmrecordService{

    @Resource
    private AlarmrecordMapper alarmrecordMapper;

    
    public int deleteByPrimaryKey(String id) {
        return alarmrecordMapper.deleteByPrimaryKey(id);
    }

    
    public int insert(Alarmrecord record) {
        return alarmrecordMapper.insert(record);
    }

    
    public int insertSelective(Alarmrecord record) {
        return alarmrecordMapper.insertSelective(record);
    }

    
    public Alarmrecord selectByPrimaryKey(String id) {
        return alarmrecordMapper.selectByPrimaryKey(id);
    }

    
    public int updateByPrimaryKeySelective(Alarmrecord record) {
        return alarmrecordMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(Alarmrecord record) {
        return alarmrecordMapper.updateByPrimaryKey(record);
    }

}
