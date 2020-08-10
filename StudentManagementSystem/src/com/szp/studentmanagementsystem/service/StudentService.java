package com.szp.studentmanagementsystem.service;

import java.util.List;

import com.szp.studentmanagementsystem.jo.StudentSelectClass;
import com.szp.studentmanagementsystem.po.Selectclass;
import com.szp.studentmanagementsystem.po.Student;


public interface StudentService {
	
	Student StudentLogin(Student student);
	
	List<StudentSelectClass> Getselectclass(String student_id);
	
	List<StudentSelectClass> Getselectclassresult(String student_id);
	
	void Studentselect(Selectclass selectclass);
	
	List<StudentSelectClass> Getclassscore(String student_id);
	
	void Studentupdatepass(Student student);

}
