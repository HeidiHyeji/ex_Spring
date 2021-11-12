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
public class TestController2 {


	@Autowired
	EntityManagerFactory emf;
	
	@RequestMapping("/hello2")
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
	
			// EntityContext 비우기
			em.flush(); // EntityContext의 변경사항을 DB반영
			em.clear();
			
			//조회
			Member findMember = em.find(Member.class, 10L);
			System.out.println(findMember);
					
	
			tx.commit(); // 내부적으로 flush 호출됨.
		}catch(Exception e) {
			tx.rollback();
		}finally {
			em.close();
		}
		////////////////////////////
		return "Hello World";
	}

}
