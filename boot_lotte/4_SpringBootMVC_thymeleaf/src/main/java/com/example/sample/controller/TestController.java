package com.example.sample.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.sample.dto.LoginDTO;
import com.example.sample.dto.UserDTO;


@Controller 
public class TestController {

	@RequestMapping("/hello")
	public String method() {
		return "main"; // resources/templates/main.html
	}
	
	@RequestMapping("/hello2")
	public String method2(Model m) {
		m.addAttribute("login", new LoginDTO("홍길동","1234"));
		return "main2"; // resources/templates/main.html
	}
	
	@RequestMapping("/hello3")
	public String method3(Model m) {
		m.addAttribute("user", new UserDTO("홍길동",20));
		return "main3"; // resources/templates/main.html
	}
	
	@RequestMapping("/hello4")
	public String method4(Model m) {
		List<UserDTO> list = Arrays.asList(new UserDTO("홍길동1", 10),
				new UserDTO("홍길동2", 20),
				new UserDTO("홍길동3", 40),
				new UserDTO("홍길동5", 45)
				);
		m.addAttribute("userList", list);
		return "main4";  // resources/templates/main4.html
	}
	
	@RequestMapping("/hello5")
	public String method5(Model m) {
		m.addAttribute("zzz", "이순신");
		return "main5";
	}
	
	@RequestMapping("/hello6")
	public String method6(@RequestParam(value="name",required = false) String name,
			@RequestParam("age") String age   ) {
		System.out.println(name +"\t" + age);
		return "main";  // resources/templates/main.html

	}



}
