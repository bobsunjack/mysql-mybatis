package com.example.mysql.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.example.mysql.mapper.UserTestMapper;
import com.example.mysql.domain.UserTest;
@Service
public class UserTestService{

    @Resource
    private UserTestMapper userTestMapper;

    
    public int deleteByPrimaryKey(String id) {
        return userTestMapper.deleteByPrimaryKey(id);
    }

    
    public int insert(UserTest record) {
        return userTestMapper.insert(record);
    }

    
    public int insertSelective(UserTest record) {
        return userTestMapper.insertSelective(record);
    }

    
    public UserTest selectByPrimaryKey(String id) {
        return userTestMapper.selectByPrimaryKey(id);
    }

    
    public int updateByPrimaryKeySelective(UserTest record) {
        return userTestMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(UserTest record) {
        return userTestMapper.updateByPrimaryKey(record);
    }

}
