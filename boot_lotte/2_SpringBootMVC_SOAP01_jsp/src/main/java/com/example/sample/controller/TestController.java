package com.example.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class TestController {

	@RequestMapping("/hello")
	public String method() {
		return "info"; // /WEB-INF/view/info.jsp
	}

}
