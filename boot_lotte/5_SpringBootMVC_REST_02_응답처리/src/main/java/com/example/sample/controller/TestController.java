package com.example.sample.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.sample.entity.Customer;


@Controller 
public class TestController {

	@RequestMapping(value="/hello",method=RequestMethod.GET)
	@ResponseBody //@Controller여도 @ResponseBody 어노테이션을 쓰면 JSon으로 리턴받을수있다.
	public String method() throws Exception{
		return "GET 방식";
	}
	
	@RequestMapping(value="/rest/customer", method=RequestMethod.GET)
	@ResponseBody
	public Customer method3() {
		// 로직처리
		return new Customer("a123","홍길동");
	}
	
	// url: http://localhost:8081/app/rest/customers
	@RequestMapping(value="/rest/customers", method=RequestMethod.GET)
	@ResponseBody
	public List<Customer> method4() {
		List<Customer> list = Arrays.asList(new Customer("a123", "홍길동12"),
				new Customer("b123", "홍길동2"),
				new Customer("ac123", "홍길동3"));
		return list;
	}

}
