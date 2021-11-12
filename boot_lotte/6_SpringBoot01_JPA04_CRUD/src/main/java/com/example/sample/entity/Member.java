package com.example.sample.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

//JPA의 엔티티 역할: JPA가 관리하는 객체 의미
@Entity
public class Member {

	@Id
	private Long id;
	private String name;
	
	public Member() {
	}

	public Member(Long id, String name) {
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
