package com.example.mysql;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
///@MapperScan("com1")
public class MysqlMybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(MysqlMybatisApplication.class, args);
	}

}
