package com.yyj.student_office.dao;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.yyj.student_office.pojo.Teacher;

public interface TeacherMapper {
	
	
	 @Select("select *\r\n" + 
	 		"    from teacher\r\n" + 
	 		"    where teacher_id = #{teacher_id } and teacher_pass = #{teacher_pass }")
	 Teacher TeacherLogin(Teacher teacher);
	
	 
	 @Update("update teacher\r\n" + 
	 		"    set teacher_pass = #{teacher_pass,jdbcType=VARCHAR}\r\n" + 
	 		"    where teacher_id = #{teacher_id,jdbcType=VARCHAR};")
	 void Teacherupdatepass(Teacher teacher);
	

}