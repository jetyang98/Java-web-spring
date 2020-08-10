package com.szp.studentmanagementsystem.service;

import java.util.List;

import com.szp.studentmanagementsystem.po.Teacher;
import com.szp.studentmanagementsystem.jo.EnteringGrades;
import com.szp.studentmanagementsystem.po.Class;
import com.szp.studentmanagementsystem.po.Selectclass;

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
