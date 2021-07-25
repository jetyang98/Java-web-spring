package com.yyj.student_office.service;

import java.util.List;

import com.yyj.student_office.pojo.StudentSelectClass;
import com.yyj.student_office.pojo.Selectclass;
import com.yyj.student_office.pojo.Student;


public interface StudentService {
	
	Student StudentLogin(Student student);
	
	List<StudentSelectClass> Getselectclass(String student_id);
	
	List<StudentSelectClass> Getselectclassresult(String student_id);
	
	void Studentselect(Selectclass selectclass);
	
	List<StudentSelectClass> Getclassscore(String student_id);
	
	void Studentupdatepass(Student student);

}
