package com.szp.studentmanagementsystem.dao;

import com.szp.studentmanagementsystem.jo.EnteringGrades;
import com.szp.studentmanagementsystem.jo.StudentSelectClass;
import com.szp.studentmanagementsystem.po.Selectclass;
import com.szp.studentmanagementsystem.po.SelectclassExample;
import com.szp.studentmanagementsystem.po.SelectclassKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SelectclassMapper {
	
	
	List<StudentSelectClass> Getselectclass(String student_id);
	
	List<StudentSelectClass> Getselectclassresult(String student_id);
	
	void Studentselect(Selectclass selectclass) ;
	
	List<StudentSelectClass> Getclassscore(String student_id);
	
	List<EnteringGrades> getEnteringGrades(String teacher_id);
	
	void AddSelectclassscore(Selectclass selectclass);

    int countByExample(SelectclassExample example);

    int deleteByExample(SelectclassExample example);

    int deleteByPrimaryKey(SelectclassKey key);

    int insert(Selectclass record);

    int insertSelective(Selectclass record);

    List<Selectclass> selectByExample(SelectclassExample example);

    Selectclass selectByPrimaryKey(SelectclassKey key);

    int updateByExampleSelective(@Param("record") Selectclass record, @Param("example") SelectclassExample example);

    int updateByExample(@Param("record") Selectclass record, @Param("example") SelectclassExample example);

    int updateByPrimaryKeySelective(Selectclass record);

    int updateByPrimaryKey(Selectclass record);
}