package com.exam.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JQueryController {

	@GetMapping(value="/")
	public String hello() {
		return "sample";
	}

}
