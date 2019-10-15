package com.example.mysql.exeucte;

import com.example.mysql.dao.TestDao;
import com.example.mysql.domain.Alarmjointarget;
import com.example.mysql.domain.Alarmrecord;
import com.example.mysql.mapper.AlarmjointargetMapper;
import com.example.mysql.service.AlarmrecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestExecute implements CommandLineRunner {
    @Autowired
    private AlarmjointargetMapper alarmjointargetMapper;
/*    @Autowired
    private TestDao testDao;*/

    @Override
    public void run(String... args) throws Exception {
        System.out.println("测试数据-----");
       // testDao.findById("7d12a3fdf22145269c5fbeb518974f2c");
        Alarmjointarget alarmjointarget= alarmjointargetMapper.findById2("7d12a3fdf22145269c5fbeb518974f2c");
        System.out.println(alarmjointarget.getChannelid());
    }
}



