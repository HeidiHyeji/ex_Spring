package com.example.sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sample.entity.Customer;
import com.example.sample.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepository;
	
	@Override
	public int insertCustomer(Customer customer) throws Exception {
		// TODO Auto-generated method stub
		return customerRepository.insertCustomer(customer);
	}

	@Override
	public Customer selectCustomerByUserid(String userid) throws Exception {
		// TODO Auto-generated method stub
		return customerRepository.selectCustomerByUserid(userid);
	}

	@Override
	public List<Customer> selectAllCustomer() throws Exception {
		// TODO Auto-generated method stub
		return customerRepository.selectAllCustomer();
	}

	@Override
	public int existsCustomer(String userid) throws Exception {
		// TODO Auto-generated method stub
		return customerRepository.existsCustomer(userid);
	}

	@Override
	public int deleteCustomer(String userid) throws Exception {
		// TODO Auto-generated method stub
		return customerRepository.deleteCustomer(userid);
	}

	@Override
	public int updateCustomer(Customer customer) throws Exception {
		// TODO Auto-generated method stub
		return customerRepository.updateCustomer(customer);
	}

}
