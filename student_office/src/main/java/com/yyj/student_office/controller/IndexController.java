package com.yyj.student_office.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/{model}-{page}")
	public String page(@PathVariable("model") String model, @PathVariable("page") String page) {
//		System.out.println("ok");
//		System.out.println(model + "/" + page);
		return model + '/' + page;
	}
	
	@RequestMapping("/")
	public String page() {
		return "login";
	}

	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/student_index")
	public String studnetIndex() {
		return "student_index";
	}
	
	@RequestMapping("/teacher_index")
	public String teacherIndex() {
		return "teacher_index";
	}
	
}
