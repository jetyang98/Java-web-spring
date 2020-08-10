package com.szp.studentmanagementsystem.dao;

import com.szp.studentmanagementsystem.po.Teacher;
import com.szp.studentmanagementsystem.po.TeacherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeacherMapper {
	
	
	 Teacher TeacherLogin(Teacher teacher);
	
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