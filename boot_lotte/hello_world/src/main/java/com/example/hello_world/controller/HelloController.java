package com.example.hello_world.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hello_world.entity.Customer;

//@Controller // SOAP 개발 방식. 응답(html, jsp)
@RestController // REST 개발 방식. 응답(json, xml). Customer.java를 json으로 바꿔준다.
public class HelloController {
	// http://localhost:포트번호/컨텍스트명/서블릿매핑/요청매핑
	// http://localhost:8080/app/hello
	@RequestMapping("/hello")
	public String method() {
		// 로직처리
		return "Hello World";
	}
	
	@RequestMapping("/hello2")
	public String method2() {
		// 로직처리
		return "Hello World2";
	}
	
	@RequestMapping("/rest/customer")
	public Customer method3() {
		// 로직처리
		return new Customer("a123","홍길동");
	}
	
	// url: http://localhost:8081/app/rest/customers
	@RequestMapping("/rest/customers")
	public List<Customer> method4() {
		List<Customer> list = Arrays.asList(new Customer("a123", "홍길동12"),
				new Customer("b123", "홍길동2"),
				new Customer("ac123", "홍길동3"));
		return list;
	}

}
