package com.example.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.sample.dto.CustomerDTO;
import com.example.sample.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService service;
	
	//1.저장
	// post
	@PostMapping("/rest/customer")
	public String insertCustomer(@RequestBody  CustomerDTO dto) throws Exception {
		return service.insertCustomer(dto);
	}

}




