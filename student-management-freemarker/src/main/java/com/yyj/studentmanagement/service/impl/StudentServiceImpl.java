package com.yyj.studentmanagement.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yyj.studentmanagement.dao.SelectclassMapper;
import com.yyj.studentmanagement.dao.StudentMapper;
import com.yyj.studentmanagement.jo.StudentSelectClass;
import com.yyj.studentmanagement.po.Selectclass;
import com.yyj.studentmanagement.po.Student;
import com.yyj.studentmanagement.service.StudentService;


@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentMapper studentMapper;

	@Autowired
	private SelectclassMapper selectclassMapper;
	
	
	@Override
	public Student StudentLogin(Student student) {
		// TODO Auto-generated method stub
		return studentMapper.StudentLogin(student);
	}

	@Override
	public List<StudentSelectClass> Getselectclass(String student_id) {
		// TODO Auto-generated method stub
		return selectclassMapper.Getselectclass(student_id);
	}

	@Override
	public List<StudentSelectClass> Getselectclassresult(String student_id) {
		// TODO Auto-generated method stub
		return selectclassMapper.Getselectclassresult(student_id);
	}

	@Override
	public void Studentselect(Selectclass selectclass) {
		// TODO Auto-generated method stub
		selectclassMapper.Studentselect(selectclass);
	}

	@Override
	public List<StudentSelectClass> Getclassscore(String student_id) {
		// TODO Auto-generated method stub
		return selectclassMapper.Getclassscore(student_id);
	}

	@Override
	public void Studentupdatepass(Student student) {
		// TODO Auto-generated method stub
		studentMapper.Studentupdatepass(student);
	}

}
