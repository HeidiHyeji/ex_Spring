package com.koreait.ex10_javaConfig;

import java.util.ArrayList;

//학생들의 정보를 입력하는 데이터 모델이다.
public class Student {
	private String name;
	private int age;
	private ArrayList<String> hobby;
	
	private double height;
	private double weight;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age, ArrayList<String> hobby) {
		super();
		this.name = name;
		this.age = age;
		this.hobby = hobby;
	}

	public double getHeight() {
		return height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public ArrayList<String> getHobby() {
		return hobby;
	}

	public void setHobby(ArrayList<String> hobby) {
		this.hobby = hobby;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		long temp;
		temp = Double.doubleToLongBits(height);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((hobby == null) ? 0 : hobby.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) { //alt+shfit+s,h
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
			return false;
		if (hobby == null) {
			if (other.hobby != null)
				return false;
		} else if (!hobby.equals(other.hobby))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		return true;
	}
	
	//xml에서 객체를 만들어서 비교!
	//1. 객체=객체: hashcode비교
	//2. 객체.equals(객체): hashcode 비교 - > 재정의해서 변수끼리 비교!!
	//			equals()와 hashcode() 메서드를 같이 재정의하면 
	//			두 객체간의 변수 내용을 재정의해서 비교시켜준다.
					
	

}
