package com.example.sample.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

//JPA의 엔티티 역할: JPA가 관리하는 객체 의미
@Entity
public class Member {

	@Id
	@GeneratedValue
	@Column(name="member_id")
	private Long id;
	private String username;
	
	//Team 참조
	// Member:Team = N:1
	@ManyToOne
	@JoinColumn(name="team_id")
	private Team team;
	
	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public Member() {
	}

	public Member(Long id, String username) {
		this.id = id;
		this.username = username;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", username=" + username + "]";
	}

	
}
