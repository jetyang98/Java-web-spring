package com.szp.studentmanagementsystem.dao;

import com.szp.studentmanagementsystem.po.Class;
import com.szp.studentmanagementsystem.po.ClassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClassMapper {
	
	
	
	
	 List<Class> Getclass(String teacher_id);
	
	 int getClassNumber() ;
	 
	 void AddClass(Class addclass);
	 
	 void UpdateClass(Class addclass);
	
	
	
	
	
	
	
    int countByExample(ClassExample example);

    int deleteByExample(ClassExample example);

    int deleteByPrimaryKey(String class_id);

    int insert(Class record);

    int insertSelective(Class record);

    List<Class> selectByExample(ClassExample example);

    Class selectByPrimaryKey(String class_id);

    int updateByExampleSelective(@Param("record") Class record, @Param("example") ClassExample example);

    int updateByExample(@Param("record") Class record, @Param("example") ClassExample example);

    int updateByPrimaryKeySelective(Class record);

    int updateByPrimaryKey(Class record);
}