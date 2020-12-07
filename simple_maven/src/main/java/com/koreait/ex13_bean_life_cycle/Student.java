package com.koreait.ex13_bean_life_cycle;

import java.util.ArrayList;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//#3. 콜백 메서드를 재정의하고, 그 위에 어노테이션을 달자!
public class Student  implements InitializingBean,DisposableBean {//초기화 할때...//빈 소멸할 수 있는
	private String name;
	private int age;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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

	//콜백 메서드 - 자동 인계되는 메서드다.
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("#3에서 close가 호출-Student에서 호출");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("#3에서 생성-Student에서 호출");
	}

}
