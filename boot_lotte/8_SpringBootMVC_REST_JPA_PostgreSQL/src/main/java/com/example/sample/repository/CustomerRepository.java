package com.example.sample.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sample.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {

	/*
	 * 	 저장: save(entity)
	       삭제: remove(entity)
	      수정: 메서드 제공안됨.
	      엔티티 수정하면 자동 수정됨
	     조회: findById(id)
	        finaAll()
	     ==> 필요시 메서드 추가 가능 
	 * 
	 */
	public List<Customer> findByUsername(String username);
}
