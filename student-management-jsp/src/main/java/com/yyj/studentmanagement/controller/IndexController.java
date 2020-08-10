package com.yyj.studentmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/{model}-{page}")
	public String page(@PathVariable("model") String model, @PathVariable("page") String page) {
		System.out.println("ok");
		System.out.println(model + "/" + page);
		return model + '/' + page;
	}

}
