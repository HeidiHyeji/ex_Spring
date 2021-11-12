package com.example.sample.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.sample.entity.Customer;

@Mapper
public interface CustomerRepository {
	public int insertCustomer(Customer customer) throws Exception;
	public Customer selectCustomerByUserid(String userid) throws Exception;
	public List<Customer> selectAllCustomer() throws Exception;
	public int existsCustomer(String userid) throws Exception;
	public int deleteCustomer(String userid) throws Exception;
	public int updateCustomer(Customer customer) throws Exception;
}
