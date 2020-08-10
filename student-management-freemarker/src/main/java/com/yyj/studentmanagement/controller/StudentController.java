package com.yyj.studentmanagement.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yyj.studentmanagement.jo.StudentSelectClass;
import com.yyj.studentmanagement.po.Selectclass;
import com.yyj.studentmanagement.po.Student;
import com.yyj.studentmanagement.service.StudentService;

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
				map.put("information", "id不存在");
			}
		} else {
			map.put("result", false);
			map.put("information", "id或密码不能为空");
		}
		return map;

	}


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
			map.put("information", "课程不存在");
		}
		return map;
	}


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
				map.put("information", "修改密码失败");
				return map;
			}
			map.put("result", true);
			map.put("information", "修改成功");
		} else {
			map.put("result", false);
			map.put("information", "id或密码不能为空");
		}
		return map;
	}
}
