package com.koreait.ex14_bean_scope;

public class Student {
	private String name;
	private int age;
	public Student() {
		System.out.println("기본 생성자-객체 생성");
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		System.out.println("인수 2개 생성자");
	}
	
}
