package com.example.sample.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.sample.dto.LoginDTO;

@Controller 
public class TestController {

	// 1. 로그인 화면 보기
	@RequestMapping(value="/loginForm", method = RequestMethod.GET)
	public String method1() {
		return "loginForm"; // /WEB-INF/view/loginForm.jsp
	}
	
	// 2. 로그인 처리
	// 요청처리 DTO로 받기
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String login(@ModelAttribute LoginDTO dto) {
		return "loginInfo";
	}
	
	// RequestParam Map으로 받기
	@RequestMapping(value="/login4", method = RequestMethod.POST)
	public String login4(@RequestParam Map<String, String> map) {
		return "loginInfo";
	}
	
	// RequestParam 옵션명 없이  받기
	@RequestMapping(value="/login3", method = RequestMethod.POST)
	public String method3(@RequestParam String userid, // 변수명과 jsp의 name값이 일치하면 RequestParamd옵션 생략가능. 
						  @RequestParam("passwd") String pw) {
		System.out.println(userid+" "+pw);
		return "loginInfo";
	}
	
	// RequestParam으로 받기
	@RequestMapping(value="/login2", method = RequestMethod.POST)
	public String method2(@RequestParam("userid") String id, 
			@RequestParam("passwd") String pw) {
		System.out.println(id+" "+pw);
		return "loginInfo";
	}

}
