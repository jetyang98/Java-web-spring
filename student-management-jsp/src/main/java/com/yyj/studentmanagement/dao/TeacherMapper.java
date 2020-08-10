package com.yyj.studentmanagement.dao;

import com.yyj.studentmanagement.po.Teacher;
import com.yyj.studentmanagement.po.TeacherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface TeacherMapper {
	
	 @Select("select *\r\n" + 
	 		"    from teacher\r\n" + 
	 		"    where teacher_id = #{teacher_id } and teacher_pass = #{teacher_pass }")
	 Teacher TeacherLogin(Teacher teacher);
	
	 @Update("update teacher\r\n" + 
	 		"    set teacher_pass = #{teacher_pass,jdbcType=VARCHAR}\r\n" + 
	 		"    where teacher_id = #{teacher_id,jdbcType=VARCHAR};")
	 void Teacherupdatepass(Teacher teacher);
	
	
	
	
	
	
	
	
	
	
	
	
    int countByExample(TeacherExample example);

    int deleteByExample(TeacherExample example);

    int deleteByPrimaryKey(String teacher_id);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    List<Teacher> selectByExample(TeacherExample example);

    Teacher selectByPrimaryKey(String teacher_id);

    int updateByExampleSelective(@Param("record") Teacher record, @Param("example") TeacherExample example);

    int updateByExample(@Param("record") Teacher record, @Param("example") TeacherExample example);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);
}