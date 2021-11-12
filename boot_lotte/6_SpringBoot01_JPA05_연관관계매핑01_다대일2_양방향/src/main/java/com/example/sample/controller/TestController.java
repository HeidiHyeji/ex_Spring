package com.example.sample.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
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
			
			Member m2  = new Member();
			m2.setUsername("mem2");
			m2.setTeam(t);
			em.persist(m2);

			// Team 통해서 Member 접근 (편리하게 접근하려고)
			List<Member> findMembers = t.getMembers();
			for (Member member : findMembers) {
				System.out.println(member);
			}
			
			
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
