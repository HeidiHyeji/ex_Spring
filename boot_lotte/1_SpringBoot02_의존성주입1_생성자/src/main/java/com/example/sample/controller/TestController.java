package com.example.sample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sample.service.TestService;


@RestController 
public class TestController {

	TestService testService; // 다형성
	
	// 1. 생성자 주입
	public TestController(TestService testService) {
		this.testService = testService;
	}

	// http://localhost:8080/app/hello
	@RequestMapping("/hello")
	public String method() throws Exception{
		return testService.findById("id");
	}

}
