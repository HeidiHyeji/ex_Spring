package com.example.sample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sample.repository.TestRepostiory;

@Service
public class TestServiceImpl implements TestService {

	@Autowired
	TestRepostiory testRepostiory;

	@Override
	public String findById(String id) throws Exception {
		return testRepostiory.findById(id);
	}

}
