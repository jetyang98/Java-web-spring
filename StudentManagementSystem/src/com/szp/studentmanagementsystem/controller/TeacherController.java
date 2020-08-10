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

import com.szp.studentmanagementsystem.po.Teacher;
import com.szp.studentmanagementsystem.po.Class;
import com.szp.studentmanagementsystem.po.Selectclass;
import com.szp.studentmanagementsystem.jo.EnteringGrades;
import com.szp.studentmanagementsystem.service.TeacherService;

@Controller
public class TeacherController {

	@Autowired
	private TeacherService teacherService;

	@RequestMapping(value = "/teacherLogin")
	@ResponseBody
	public Map<String, Object> TeacherLogin(@RequestBody Teacher teacher) {

		Map<String, Object> map = new HashMap<String, Object>();

		if (teacher.getTeacher_id() != null && teacher.getTeacher_pass() != null) {
			Teacher tea = new Teacher();
			tea = teacherService.TeacherLogin(teacher);
			if (tea.getTeacher_id() != null) {
				map.put("result", true);
				map.put("information", "锟斤拷录锟缴癸拷");
			} else {
				map.put("result", false);
				map.put("information", "id锟斤拷锟斤拷锟斤拷锟斤拷锟�");
			}
		} else {
			map.put("result", false);
			map.put("information", "id锟斤拷锟斤拷锟诫都锟斤拷锟斤拷为锟斤拷");
		}
		return map;

	}

	// 锟矫碉拷锟窖撅拷锟斤拷锟斤拷锟侥匡拷
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

	// 锟斤拷锟接课筹拷
	@RequestMapping(value = "/releaseCourse/addClass")
	@ResponseBody
	public Map<String, Object> AddClass(@RequestBody Class addclass) {

		Map<String, Object> map = new HashMap<String, Object>();

		int number = teacherService.getClassNumber();
		addclass.setClass_id((number + 1) + "");

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

	// 锟斤拷锟接课筹拷
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

	// 录锟斤拷杉锟�
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

	// 锟斤拷锟斤拷录锟斤拷杉锟�

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

	// 锟睫革拷锟斤拷锟斤拷
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
				map.put("information", "锟睫革拷失锟斤拷");
				return map;
			}
			map.put("result", true);
			map.put("information", "锟睫改成癸拷");

		} else {
			map.put("result", false);
			map.put("information", "id锟斤拷锟斤拷锟诫都锟斤拷锟斤拷为锟斤拷");
		}
		return map;

	}

}
