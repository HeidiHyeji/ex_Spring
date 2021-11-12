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
public class TestController3 {


	@Autowired
	EntityManagerFactory emf;
	
	@RequestMapping("/hello3")
	public String method() {
		///////////////////////////
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		try {
			//저장
			Member m = new Member();
			m.setId(10L);
			m.setName("홍길동");
			em.persist(m);
			em.flush();
			System.out.println("##############################################");
	
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
