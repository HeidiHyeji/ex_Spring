package com.example.sample.service;

import org.springframework.stereotype.Service;

import com.example.sample.repository.TestRepostiory;

@Service
public class TestServiceImpl implements TestService {

	TestRepostiory testRepostiory;
	
	// 1. 생성자 주입
	public TestServiceImpl(TestRepostiory testRepostiory) {
		this.testRepostiory = testRepostiory;
	}

	@Override
	public String findById(String id) throws Exception {
		return testRepostiory.findById(id);
	}

}
