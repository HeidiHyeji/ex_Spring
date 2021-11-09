package com.example.sample.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.sample.entity.Customer;

@RestController
public class TestController {

	/*
	 *    {
	 * 
	 *    }     @RequestBody =======> Customer 클래스에 저장 
	 * 
	 */

	// 1. POST: 특정 고객저장
	@PostMapping(value = "/rest/customer")
	public String method(@RequestBody Customer customer) {
		System.out.println(customer);
		return customer.getUserid() + "가진 고객이 생성";
	}

	// 2. POST: 여러 고객저장
	/*
	    [
	      { },            @RequestBody 
	      { }     =============================> List<Customer>
	    ]
	  
	 */
	@PostMapping(value = "/rest/customers")
	public String method2(@RequestBody List<Customer> list) {
		System.out.println(list);
		return list+ "가진 고객이 생성";
	}

}
