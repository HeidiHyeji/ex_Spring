package com.example.sample.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;


@Entity
@SequenceGenerator(name = "Member4_SEQ_GENERATOR",
sequenceName = "MEMBER_SEQ", initialValue = 10)
public class Member4 {

	//2. 자동 할당
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,
			        generator = "Member4_SEQ_GENERATOR")
	private Long id;
	private String name;
	
	public Member4() {
	}

	public Member4(Long id, String name) {
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
