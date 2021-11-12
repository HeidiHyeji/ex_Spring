package com.example.sample.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sample.dto.CustomerDTO;
import com.example.sample.entity.Customer;
import com.example.sample.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository  customerRepository;
	
	@Override
	public String insertCustomer(CustomerDTO dto) throws Exception {
		// CustomerDTO ==> Customer 변환
		Customer entity = Customer.builder()
				          .id(UUID.randomUUID().toString())
				          .username(dto.getUsername())
				          .address(dto.getAddress())
				          .age(dto.getAge())
					      .build();
		customerRepository.save(entity);
		return entity.getId();
	}

}
