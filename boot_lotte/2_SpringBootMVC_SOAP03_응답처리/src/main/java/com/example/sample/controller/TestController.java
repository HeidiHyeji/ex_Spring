package com.example.sample.controller;


import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.sample.dto.LoginDTO;

@Controller 
public class TestController {
	// 역할2가지: View와 Model 2가지 알려주는 작업
	
	// 1. 리턴타입인 String 이면 View의 논리적 이름으로 인식(파일명)
	@RequestMapping("/hello")
	public String method() {
		return "info"; // /WEB-INF/view/info.jsp
	}
	
	// 2. View와 Model 2가지 모두 설정
	@RequestMapping("/hello2")
	public ModelAndView method2() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("info2"); // /WEB-INF/views/info2.jsp
		mav.addObject("username","홍길동"); // Model 설정
		mav.addObject("age",20); // Model 설정
		return mav;
	}
	
	// 4. Model 만 지정 ==> View는 요청매핑값으로 유추한다.
		// // /WEB-INF/views/hello4.jsp
		@RequestMapping("/hello4")
		@ModelAttribute("yyy") // ArrayList<LoginDTO>의 key값으로 설정
		public ArrayList<LoginDTO> method5() {
			ArrayList<LoginDTO> list = new ArrayList<LoginDTO>();
			list.add(new LoginDTO("A123", "1234"));
			list.add(new LoginDTO("B123", "9999"));
			list.add(new LoginDTO("C123", "8888"));
					
			return list;
		}
}
