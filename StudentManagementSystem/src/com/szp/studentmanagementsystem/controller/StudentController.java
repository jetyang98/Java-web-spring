package com.szp.studentmanagementsystem.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.szp.studentmanagementsystem.jo.StudentSelectClass;
import com.szp.studentmanagementsystem.po.Selectclass;
import com.szp.studentmanagementsystem.po.Student;
import com.szp.studentmanagementsystem.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;

	@RequestMapping(value = "/studentLogin")
	@ResponseBody
	public Map<String, Object> StudentLogin(@RequestBody Student student) {

		Map<String, Object> map = new HashMap<String, Object>();

		if (student.getStudent_id() != "" && student.getStudent_pass() != "") {
			Student stu = studentService.StudentLogin(student);
			if (stu != null) {
				map.put("result", true);
				map.put("information", "登录成功");
			} else {
				map.put("result", false);
				map.put("information", "id或密码错误");
			}
		} else {
			map.put("result", false);
			map.put("information", "id、密码都不能为空");
		}
		return map;

	}

	// 得到待选课
	@RequestMapping(value = "/select/getselectclass")
	@ResponseBody
	public List<StudentSelectClass> Getselectclass(String student_id) {

		if (student_id != null) {
			List<StudentSelectClass> list = new ArrayList<StudentSelectClass>();
			list = studentService.Getselectclass(student_id);
			return list;
		} else {
			return null;
		}
	}

	// 得到已经选课
	@RequestMapping(value = "/select/getselectclassresult")
	@ResponseBody
	public List<StudentSelectClass> Getselectclassresult(String student_id) {

		if (student_id != null) {
			List<StudentSelectClass> list = new ArrayList<StudentSelectClass>();
			list = studentService.Getselectclassresult(student_id);
			return list;
		} else {
			return null;
		}
	}

	// 选课
	@RequestMapping(value = "/studentselect")
	@ResponseBody
	public Map<String, Object> Studentselect(@RequestBody Selectclass selectclass) {

		Map<String, Object> map = new HashMap<String, Object>();

		if (selectclass.getClass_id() != null && selectclass.getStudent_id() != null) {
			try {
				studentService.Studentselect(selectclass);
				map.put("result", true);
			} catch (Exception e) {
				e.printStackTrace();
				map.put("result", false);
			}
		} else {
			map.put("result", false);
			map.put("information", "学生id为空或者课程id为空");
		}
		return map;
	}

	// 得到学生成绩
	@RequestMapping(value = "/find/getclassscore")
	@ResponseBody
	public List<StudentSelectClass> Getclassscore(String student_id) {

		if (student_id != null) {
			List<StudentSelectClass> list = new ArrayList<StudentSelectClass>();

			list = studentService.Getclassscore(student_id);

			return list;
		} else {
			return null;
		}
	}

	// 修改学生密码
	@RequestMapping(value = "/studentupdatepass")
	@ResponseBody
	public Map<String, Object> Studentupdatepass(@RequestBody Student student) {

		Map<String, Object> map = new HashMap<String, Object>();

		if (student.getStudent_id() != null && student.getStudent_pass() != null) {
			try {
				studentService.Studentupdatepass(student);
			} catch (Exception e) {
				e.printStackTrace();
				map.put("result", false);
				map.put("information", "修改失败");
				return map;
			}
			map.put("result", true);
			map.put("information", "修改成功");
		} else {
			map.put("result", false);
			map.put("information", "id、密码都不能为空");
		}
		return map;
	}
}
