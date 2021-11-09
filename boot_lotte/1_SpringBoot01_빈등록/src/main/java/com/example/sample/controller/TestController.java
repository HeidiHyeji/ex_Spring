package com.example.sample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController 
public class TestController {

	
	public TestController() {
		System.out.println("TestController 생성");
	}

	// http://localhost:8080/app/hello
	@RequestMapping("/hello")
	public String method() {
		// 로직처리
		return "Hello World";
	}

}
