package com.example.sample.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sample.entity.Member;
import com.example.sample.entity.Member2;
import com.example.sample.entity.Member3;
import com.example.sample.entity.Member4;
import com.example.sample.entity.Member5;

@RestController
public class TestController {

	
	@Autowired
	EntityManagerFactory emf;
	
	@RequestMapping("/hello")
	public String method() {
		///////////////////////////
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		try {
			
			//1. Member 생성 ==> 레코드 생성, id값 직접 할당
			Member m = new Member();
			m.setId(System.currentTimeMillis());
			em.persist(m);
			
			//2. 자동할당
			Member2 m2 = new Member2();
			em.persist(m2);
			
			Member3 m3 = new Member3();
			em.persist(m3);
			
			Member4 m4 = new Member4();
			em.persist(m4);
			
			Member5 m5 = new Member5();
			em.persist(m5);
			
			tx.commit();
		}catch(Exception e) {
			tx.rollback();
		}finally {
			em.close();
		}
		////////////////////////////
		return "Hello World";
	}

}
