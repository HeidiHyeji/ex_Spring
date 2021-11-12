package com.example.sample.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController 
public class TestController {

	@Value("${server.port}")
	String port;
	// http://localhost:8080/app/hello
	@RequestMapping("/hello")
	public String method() throws Exception{
		System.out.println("현재 사용중인 port:"+port);
		return "Hello World";
	}

}
