package com.example.sample.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//JPA의 엔티티 역할: JPA가 관리하는 객체 의미
@Entity
@Table(name = "TB_MEMBER")
public class Member2 {

	@Id
	private Long id;
	private String name;
	
	public Member2() {
	}

	public Member2(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + "]";
	}
	
	
}
