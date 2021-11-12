package com.example.sample.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Transient;

//JPA의 엔티티 역할: JPA가 관리하는 객체 의미
@Entity
public class Member {

	@Id
	private Long id;
	
	@Column(name="name")
	private String username;
	
	@Column(length = 500, unique = true)
	private String address;
	
	@Enumerated(EnumType.STRING)
	private RoleType roleType;
	
	private LocalDate localDate;
	private LocalDateTime localDateTime;
	
	@Lob
	private String description;
	
	@Transient
	private String temp;
}





