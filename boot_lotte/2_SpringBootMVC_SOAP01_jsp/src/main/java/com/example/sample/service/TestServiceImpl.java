package com.example.sample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sample.repository.TestRepostiory;

@Service("TestServiceImpl")
public class TestServiceImpl implements TestService {

	@Autowired
	TestRepostiory testRepostiory;

	@Override
	public String findById(String id) throws Exception {
		System.out.println("TestServiceImpl >>>>");
		return testRepostiory.findById(id);
	}

}
