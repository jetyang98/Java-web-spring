package com.yyj.studentmanagement;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.yyj.studentmanagement.dao")
@SpringBootApplication
public class StudentManagementFreemarkerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementFreemarkerApplication.class, args);
	}

}
