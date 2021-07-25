package com.yyj.student_office.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yyj.student_office.dao.ClassMapper;
import com.yyj.student_office.dao.SelectclassMapper;
import com.yyj.student_office.dao.TeacherMapper;
import com.yyj.student_office.pojo.EnteringGrades;
import com.yyj.student_office.pojo.Class;
import com.yyj.student_office.pojo.Selectclass;
import com.yyj.student_office.pojo.Teacher;
import com.yyj.student_office.service.TeacherService;


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
