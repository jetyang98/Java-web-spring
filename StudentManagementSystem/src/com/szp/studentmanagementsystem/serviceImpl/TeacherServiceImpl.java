package com.szp.studentmanagementsystem.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.szp.studentmanagementsystem.dao.ClassMapper;
import com.szp.studentmanagementsystem.dao.SelectclassMapper;
import com.szp.studentmanagementsystem.dao.TeacherMapper;
import com.szp.studentmanagementsystem.jo.EnteringGrades;
import com.szp.studentmanagementsystem.po.Class;
import com.szp.studentmanagementsystem.po.Selectclass;
import com.szp.studentmanagementsystem.po.Teacher;
import com.szp.studentmanagementsystem.service.TeacherService;



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
