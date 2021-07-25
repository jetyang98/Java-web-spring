package com.yyj.student_office;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.yyj.student_office.dao")
@SpringBootApplication
public class StudentOfficeApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentOfficeApplication.class, args);
	}

}
