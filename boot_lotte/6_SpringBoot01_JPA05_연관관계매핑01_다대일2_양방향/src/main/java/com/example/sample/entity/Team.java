package com.example.sample.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Team {

	@Id
	@GeneratedValue
	@Column(name="team_id")
	private Long id;
	
	private String name;

	// Team:Member = 1:N
	//Member 참조
	@OneToMany(mappedBy = "team")
	private List<Member> members = new ArrayList<Member>();
	
	public Team() {
	}

	public Team(Long id, String name) {
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

	public List<Member> getMembers() {
		return members;
	}

	public void setMembers(List<Member> members) {
		this.members = members;
	}

	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + "]";
	}
	
	//유틸리티 메서드
	public void addMember(Member m) {
		this.members.add(m);
		m.setTeam(this);
	}
	
	
	
	
	
}
