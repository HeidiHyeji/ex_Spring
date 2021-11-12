package com.exam.sample.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.exam.sample.entity.User;

@Controller
public class UserController {

	 @GetMapping("/")
	 public String getStaff(Model m) {
		 return "index";
	 }
	 
	 @GetMapping("/login_success")
	 public String success(Model m) {
		 OAuth2AuthenticationToken authentication = (OAuth2AuthenticationToken)SecurityContextHolder.getContext().getAuthentication();
		 Map<String, Object> map = authentication.getPrincipal().getAttributes();
		 Map<String, String> propertyMap = (HashMap<String, String>)map.get("properties");
		 User user = User.builder()
				     .name(propertyMap.get("nickname"))
				     .email(propertyMap.get("kaccount_email"))
				     .build();
		 m.addAttribute("username", user.getName());
		 return "login_success";
	 }
	 
	
}
