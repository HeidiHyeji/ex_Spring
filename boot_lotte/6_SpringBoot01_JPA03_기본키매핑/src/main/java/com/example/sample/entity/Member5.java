package com.example.sample.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.TableGenerator;


@Entity
@TableGenerator(name = "Member5_SEQ_GENERATOR",
                 table = "MY_SEQUENCES")
public class Member5 {

	//2. 자동 할당
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE,
			        generator = "Member5_SEQ_GENERATOR")
	private Long id;
	private String name;
	
	public Member5() {
	}

	public Member5(Long id, String name) {
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
