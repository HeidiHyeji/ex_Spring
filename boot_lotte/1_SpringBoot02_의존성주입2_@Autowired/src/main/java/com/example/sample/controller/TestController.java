package com.example.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sample.service.TestService;


@RestController 
public class TestController {

	@Autowired
	TestService testService; // 다형성

	// http://localhost:8080/app/hello
	@RequestMapping("/hello")
	public String method() throws Exception{
		return testService.findById("id");
	}

}
