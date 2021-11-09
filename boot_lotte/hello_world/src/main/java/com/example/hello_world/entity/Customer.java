package com.example.hello_world.entity;

public class Customer {
	private String userid;
	private String username;
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public Customer(String userid, String username) {
		this.userid = userid;
		this.username = username;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Override
	public String toString() {
		return "Customer [userid=" + userid + ", username=" + username + "]";
	}
	
	
}