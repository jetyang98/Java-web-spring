package com.yyj.student_office.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.yyj.student_office.pojo.Class;

public interface ClassMapper {
	
	
	 @Select("select * from class where teacher_id = #{teacher_id } ")
	 List<Class> Getclass(@Param("teacher_id") String teacher_id);
	
	 
	 @Select("select count(1) from class")
	 int getClassNumber() ;
	 
	 
	 @Insert(" insert into class (class_id, class_name, teacher_id, " + 
	 		"  class_address, class_time)" + 
	 		"  values (#{class_id,jdbcType=VARCHAR}, #{class_name,jdbcType=VARCHAR}, #{teacher_id,jdbcType=VARCHAR}," + 
	 		"  #{class_address,jdbcType=VARCHAR}, #{class_time,jdbcType=TIME})")
	 void AddClass(Class addclass);
	 
	 
	 @Update("update class\r\n" + 
	 		"    set\r\n" + 
	 		"      class_name = #{class_name},\r\n" + 
	 		"      teacher_id = #{teacher_id},\r\n" + 
	 		"      class_address = #{class_address},\r\n" + 
	 		"      class_time = #{class_time}\r\n" + 
	 		"      where  class_id = #{class_id}")
	 void UpdateClass(Class addclass);
	
	
}