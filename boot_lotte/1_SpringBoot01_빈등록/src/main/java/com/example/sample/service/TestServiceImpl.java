package com.example.sample.service;

import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

	public TestServiceImpl() {
		System.out.println("TestServiceImpl 생성");
	}

	@Override
	public String findById(String id) throws Exception {
		return null;
	}

}
