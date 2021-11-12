package com.example.sample.entity;

public class Customer {

	private String userid;
	private String name;
	private String pwd;
	private String email;
	private String createDate;
	
	public Customer() {
	}

	public Customer(String userid, String name, String pwd, String email, String createDate) {
		this.userid = userid;
		this.name = name;
		this.pwd = pwd;
		this.email = email;
		this.createDate = createDate;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	
}
