package com.example.sample.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {
	
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/staff")
	public String staff() {
		return "staff";
	}
	@GetMapping("/admin")
	public String admin() {
		return "admin";
	}
	@GetMapping("/customlogin")
	public String customlogin() {
		return "customlogin";
	}
}







