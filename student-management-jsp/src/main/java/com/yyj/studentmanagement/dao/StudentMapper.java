package com.yyj.studentmanagement.dao;

import com.yyj.studentmanagement.po.Student;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;


public interface StudentMapper {

	
	@Select("select *\r\n" + 
			"    from student\r\n" + 
			"    where student_id = #{student_id} and student_pass=#{student_pass}")
    Student StudentLogin(Student student);

	
	@Update("update student\r\n" + 
			"    set \r\n" + 
			"      student_pass = #{student_pass}\r\n" + 
			"    where student_id = #{student_id}")
    void Studentupdatepass(Student student);


}