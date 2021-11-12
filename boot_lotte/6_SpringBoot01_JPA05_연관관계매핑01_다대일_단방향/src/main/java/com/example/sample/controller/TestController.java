package com.example.sample.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sample.entity.Member;
import com.example.sample.entity.Team;


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
		
			// Member:Team = N:1
			Team t = new  Team();
			t.setName("teamA");
			em.persist(t);
			
			Member m  = new Member();
			m.setUsername("mem1");
			m.setTeam(t);
			em.persist(m);

			// Member 통해서 Team 접근 가능 ==> 객체 그래프 탐색 가능
			Member findMember = em.find(Member.class, m.getId());
			
			Team findTeam = findMember.getTeam();
			System.out.println(findTeam);
			
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
