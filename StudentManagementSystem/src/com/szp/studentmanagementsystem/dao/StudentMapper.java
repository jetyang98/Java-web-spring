package com.szp.studentmanagementsystem.dao;

import com.szp.studentmanagementsystem.po.Student;
import com.szp.studentmanagementsystem.po.StudentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;


public interface StudentMapper {

    Student StudentLogin(Student student);

    void Studentupdatepass(Student student);

    int countByExample(StudentExample example);

    int deleteByExample(StudentExample example);

    int deleteByPrimaryKey(String student_id);

    int insert(Student record);

    int insertSelective(Student record);

    List<Student> selectByExample(StudentExample example);

    Student selectByPrimaryKey(String student_id);

    int updateByExampleSelective(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByExample(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}