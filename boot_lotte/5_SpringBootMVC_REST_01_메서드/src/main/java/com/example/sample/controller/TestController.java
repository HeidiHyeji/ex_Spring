package com.example.sample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController 
public class TestController {

	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String method() throws Exception{
		return "GET 방식";
	}
	
	@RequestMapping(value="/hello",method=RequestMethod.POST)
	public String method2() throws Exception{
		return "POST 방식";
	}
	
	// PUT과 DELETE 도구 사용해서 요청 가능 ( Postman, Swagger API(***))
	@RequestMapping(value="/hello",method=RequestMethod.PUT)
	public String method3() throws Exception{
		return "PUT 방식";
	}
	
	@RequestMapping(value="/hello",method=RequestMethod.DELETE)
	public String method4() throws Exception{
		return "DELETE 방식";
	}

}
