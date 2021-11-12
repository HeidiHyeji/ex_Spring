package com.example.sample.repository;

import org.springframework.stereotype.Repository;

@Repository
public class TestRepostiory{
	
	public String findById(String id) throws Exception {
		return "홍길동";
	}

}
