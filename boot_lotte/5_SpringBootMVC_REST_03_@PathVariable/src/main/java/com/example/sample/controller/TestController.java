package com.example.sample.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	// 1. GET: 모든 고객정보 보기
	@GetMapping(value = "/rest/customers")
	public String method() {
		return "모든 고객정보 보기";
	}

	// 2. GET: 특정 고객정보 보기
	// GET: http://localhost:8081/app/rest/customers/10
	// GET: http://localhost:8081/app/rest/customers/20
	@GetMapping(value = "/rest/customers/{userid}")
	public String method2(@PathVariable("userid") String id) {
		return id + "에 해당하는 고객정보 보기";
	}

	// 2. DELETE: 특정 고객 삭제
	// GET: http://localhost:8081/app/rest/customers/10
	// GET: http://localhost:8081/app/rest/customers/20
	@DeleteMapping(value = "/rest/customers/{userid}")
	public String method3(@PathVariable("userid") String id) {
		return id + "에 해당하는 고객 삭제 하기";
	}

	// 3. UPDATE: 특정 고객 수정
	// PUT: http://localhost:8081/app/rest/customers/10/hong
	// PUT: http://localhost:8081/app/rest/customers/20/park
	@PutMapping(value = "/rest/customers/{userid}/{username}")
	public String method4(@PathVariable("userid") String id,
			@PathVariable("username") String name) {
		return id + "에 해당하는 고객의 이름을 "+ name +"으로 수정";
	}
}




