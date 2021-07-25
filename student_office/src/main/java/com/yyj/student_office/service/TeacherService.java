package com.yyj.student_office.service;

import java.util.List;

import com.yyj.student_office.pojo.EnteringGrades;
import com.yyj.student_office.pojo.Class;
import com.yyj.student_office.pojo.Selectclass;
import com.yyj.student_office.pojo.Teacher;

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
