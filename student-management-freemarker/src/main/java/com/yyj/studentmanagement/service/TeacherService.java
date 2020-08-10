package com.yyj.studentmanagement.service;

import java.util.List;

import com.yyj.studentmanagement.po.Teacher;
import com.yyj.studentmanagement.jo.EnteringGrades;
import com.yyj.studentmanagement.po.Class;
import com.yyj.studentmanagement.po.Selectclass;

public interface TeacherService {
	
	Teacher TeacherLogin(Teacher teacher);
	
	List<Class> Getclass(String teacher_id);
	
	int getClassNumber();
	 
	void AddClass(Class addclass);
	
	void UpdateClass(Class addclass);
	 
	List<EnteringGrades> getEnteringGrades(String teacher_id);
	
	void AddSelectclassscore(Selectclass selectclass);
	
	void Teacherupdatepass(Teacher teacher);
	
}
