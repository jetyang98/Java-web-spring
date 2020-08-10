package com.yyj.studentmanagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yyj.studentmanagement.dao.ClassMapper;
import com.yyj.studentmanagement.dao.SelectclassMapper;
import com.yyj.studentmanagement.dao.TeacherMapper;
import com.yyj.studentmanagement.jo.EnteringGrades;
import com.yyj.studentmanagement.po.Class;
import com.yyj.studentmanagement.po.Selectclass;
import com.yyj.studentmanagement.po.Teacher;
import com.yyj.studentmanagement.service.TeacherService;



@Service
public class TeacherServiceImpl implements TeacherService {

	
	@Autowired
	private TeacherMapper teacherMapper;

	@Autowired
	private ClassMapper classMapper;
	
	@Autowired
	private SelectclassMapper selectclassMapper;
	
	@Override
	public Teacher TeacherLogin(Teacher teacher) {
		// TODO Auto-generated method stub
		 
		return teacherMapper.TeacherLogin(teacher);
	}

	@Override
	public List<Class> Getclass(String teacher_id) {
		// TODO Auto-generated method stub
		return classMapper.Getclass(teacher_id);
	}

	@Override
	public int getClassNumber() {
		// TODO Auto-generated method stub
		return classMapper.getClassNumber();
	}

	@Override
	public void AddClass(Class addclass) {
		// TODO Auto-generated method stub
		classMapper.AddClass(addclass);
	}

	@Override
	public void UpdateClass(Class addclass) {
		// TODO Auto-generated method stub
		classMapper.UpdateClass(addclass);
	}

	@Override
	public List<EnteringGrades> getEnteringGrades(String teacher_id) {
		// TODO Auto-generated method stub
		return selectclassMapper.getEnteringGrades(teacher_id);
	}

	@Override
	public void AddSelectclassscore(Selectclass selectclass) {
		// TODO Auto-generated method stub
		selectclassMapper.AddSelectclassscore(selectclass);
	}

	@Override
	public void Teacherupdatepass(Teacher teacher) {
		// TODO Auto-generated method stub
		teacherMapper.Teacherupdatepass(teacher);
	}
	
	

}
