package com.example.sample.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.sample.entity.Customer;
import com.example.sample.service.CustomerService;


@RestController 
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	@RequestMapping(value="/customers/{userid}/exists",method=RequestMethod.GET)
	public boolean 고객존재여부(@PathVariable("userid") String userid) throws Exception{
		return customerService.existsCustomer(userid) > 0 ? true: false;
	}
	
	@RequestMapping(value="/customer",method=RequestMethod.POST)
	public int 고객등록(@RequestBody Customer customer) throws Exception{
		customer.setUserid(UUID.randomUUID().toString());
		return customerService.insertCustomer(customer);
	}
	
	@RequestMapping(value="/customers/{userid}",method=RequestMethod.GET)
	public Customer 고객조회(@PathVariable("userid") String userid) throws Exception{
		return customerService.selectCustomerByUserid(userid);
	}
	
	@RequestMapping(value="/customers",method=RequestMethod.GET)
	public List<Customer> 고객전체조회() throws Exception{
		return customerService.selectAllCustomer();
	}
	
	@RequestMapping(value="/customers/{userid}",method=RequestMethod.DELETE)
	public int 고객삭제(@PathVariable("userid") String userid) throws Exception{
		return customerService.deleteCustomer(userid);
	}
	
	// PUT과 DELETE 도구 사용해서 요청 가능 ( Postman, Swagger API(***))
	@RequestMapping(value="/customer",method=RequestMethod.PUT)
	public int 고객수정(@RequestBody Customer customer) throws Exception{
		return customerService.updateCustomer(customer);
	}
	


}
