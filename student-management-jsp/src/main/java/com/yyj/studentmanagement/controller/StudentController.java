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
				map.put("information", "��¼�ɹ�");
			} else {
				map.put("result", false);
				map.put("information", "id���������");
			}
		} else {
			map.put("result", false);
			map.put("information", "id�����붼����Ϊ��");
		}
		return map;

	}

	// �õ���ѡ��
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

	// �õ��Ѿ�ѡ��
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

	// ѡ��
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
			map.put("information", "ѧ��idΪ�ջ��߿γ�idΪ��");
		}
		return map;
	}

	// �õ�ѧ���ɼ�
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

	// �޸�ѧ������
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
				map.put("information", "�޸�ʧ��");
				return map;
			}
			map.put("result", true);
			map.put("information", "�޸ĳɹ�");
		} else {
			map.put("result", false);
			map.put("information", "id�����붼����Ϊ��");
		}
		return map;
	}
}
