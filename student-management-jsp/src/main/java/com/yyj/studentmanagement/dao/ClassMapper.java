package com.yyj.studentmanagement.dao;

import com.yyj.studentmanagement.po.Class;
//import com.yyj.studentmanagement.po.ClassExample;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface ClassMapper {
	
	
	
	 @Select("select * from class where teacher_id = #{teacher_id } ")
	 List<Class> Getclass(@Param("teacher_id") String teacher_id);
	
	 @Select("select count(1) from class")
	 int getClassNumber() ;
	 
	 @Insert(" insert into class (class_id, class_name, teacher_id, " + 
	 		"  class_address, class_time)" + 
	 		"  values (#{class_id,jdbcType=VARCHAR}, #{class_name,jdbcType=VARCHAR}, #{teacher_id,jdbcType=VARCHAR}," + 
	 		"  #{class_address,jdbcType=VARCHAR}, #{class_time,jdbcType=VARCHAR})")
	 void AddClass(Class addclass);
	 
	 @Update("update class\r\n" + 
	 		"    set\r\n" + 
	 		"      class_name = #{class_name},\r\n" + 
	 		"      teacher_id = #{teacher_id},\r\n" + 
	 		"      class_address = #{class_address},\r\n" + 
	 		"      class_time = #{class_time}\r\n" + 
	 		"      where  class_id = #{class_id}")
	 void UpdateClass(Class addclass);
	
	
	
	
	
	
	
//    int countByExample(ClassExample example);
//
//    int deleteByExample(ClassExample example);
//
//    int deleteByPrimaryKey(String class_id);
//
//    int insert(Class record);
//
//    int insertSelective(Class record);
//
//    List<Class> selectByExample(ClassExample example);
//
//    Class selectByPrimaryKey(String class_id);
//
//    int updateByExampleSelective(@Param("record") Class record, @Param("example") ClassExample example);
//
//    int updateByExample(@Param("record") Class record, @Param("example") ClassExample example);
//
//    int updateByPrimaryKeySelective(Class record);
//
//    int updateByPrimaryKey(Class record);
}