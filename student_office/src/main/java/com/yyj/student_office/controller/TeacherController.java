package com.yyj.student_office.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yyj.student_office.pojo.EnteringGrades;
import com.yyj.student_office.pojo.Class;
import com.yyj.student_office.pojo.Selectclass;
import com.yyj.student_office.pojo.Teacher;
import com.yyj.student_office.service.TeacherService;

@Controller
public class TeacherController {

	@Autowired
	private TeacherService teacherService;

	@RequestMapping(value = "/teacherLogin")
	@ResponseBody
	public Map<String, Object> TeacherLogin(@RequestBody Teacher teacher) {

		Map<String, Object> map = new HashMap<String, Object>();

		if (teacher.getTeacher_id() != "" && teacher.getTeacher_pass() != "") {
			Teacher tea = teacherService.TeacherLogin(teacher);
			if (tea != null) {
				map.put("result", true);
				map.put("information", "登录成功");
			} else {
				map.put("result", false);
				map.put("information", "id或密码错误");
			}
		} else {
			map.put("result", false);
			map.put("information", "id或密码不能为空");
		}
		return map;

	}

	
//	获得课程信息
	@RequestMapping(value = "/releaseCourse/getclass")
	@ResponseBody
	public List<Class> Getclass(String teacher_id) {

		if (teacher_id != null) {
			List<Class> list = new ArrayList<Class>();
			list = teacherService.Getclass(teacher_id);
			System.out.print(list.size());
			return list;
		} else {
			return null;
		}

	}


//	添加课程
	@RequestMapping(value = "/releaseCourse/addClass")
	@ResponseBody
	public Map<String, Object> AddClass(@RequestBody Class addclass) {

		Map<String, Object> map = new HashMap<String, Object>();

		int number = teacherService.getClassNumber();
		addclass.setClass_id("c" + (number + 1));

		try {
			teacherService.AddClass(addclass);
		} catch (Exception e) {
			e.printStackTrace();
			map.put("result", false);
			return map;
		}
		map.put("result", true);
		return map;

	}


//	修改课程
	@RequestMapping(value = "/releaseCourse/updateClass")
	@ResponseBody
	public Map<String, Object> UpdateClass(@RequestBody Class addclass) {

		Map<String, Object> map = new HashMap<String, Object>();

		try {
			teacherService.UpdateClass(addclass);
		} catch (Exception e) {
			e.printStackTrace();
			map.put("result", false);
			return map;
		}
		map.put("result", true);
		return map;

	}


//	获得课程各成绩
	@RequestMapping(value = "/enteringGrades/getSelectclass")
	@ResponseBody
	public List<EnteringGrades> getEnteringGrades(String teacher_id) {

		if (teacher_id != null) {
			List<EnteringGrades> list = new ArrayList<EnteringGrades>();
			list = teacherService.getEnteringGrades(teacher_id);
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getStudent_id() == null) {
					list.remove(i);
					i--;
				}
			}
			return list;
		} else {
			return null;
		}

	}


//	添加课程成绩
	@RequestMapping(value = "/enteringGrades/AddSelectclassscore")
	@ResponseBody
	public Map<String, Object> AddSelectclassscore(@RequestBody Selectclass selectclass) {

		Map<String, Object> map = new HashMap<String, Object>();

		if (selectclass.getClass_id() != null && selectclass.getStudent_id() != null) {
			try {
				teacherService.AddSelectclassscore(selectclass);
			} catch (Exception e) {
				e.printStackTrace();
				map.put("result", false);
				return map;
			}
			map.put("result", true);

			return map;
		} else {
			map.put("result", false);
			return map;
		}

	}


	@RequestMapping(value = "/teacherupdatepass")
	@ResponseBody
	public Map<String, Object> Teacherupdatepass(@RequestBody Teacher teacher) {

		Map<String, Object> map = new HashMap<String, Object>();

		if (teacher.getTeacher_id() != null && teacher.getTeacher_pass() != null) {

			try {
				teacherService.Teacherupdatepass(teacher);
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
