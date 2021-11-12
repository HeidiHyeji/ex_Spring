package com.example.sample.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sample.entity.Member;


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
			//저장
			Member m = new Member();
			m.setId(System.currentTimeMillis());
			m.setName("홍길동");
			em.persist(m);
			
			//변경
//			m.setName("이순신");
			
			em.remove(m);
	
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
