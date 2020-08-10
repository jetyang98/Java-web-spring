package com.yyj.studentmanagement.service;

import java.util.List;

import com.yyj.studentmanagement.jo.StudentSelectClass;
import com.yyj.studentmanagement.po.Selectclass;
import com.yyj.studentmanagement.po.Student;


public interface StudentService {
	
	Student StudentLogin(Student student);
	
	List<StudentSelectClass> Getselectclass(String student_id);
	
	List<StudentSelectClass> Getselectclassresult(String student_id);
	
	void Studentselect(Selectclass selectclass);
	
	List<StudentSelectClass> Getclassscore(String student_id);
	
	void Studentupdatepass(Student student);

}
