package com.koreait.ex14_bean_scope;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args){
		AbstractApplicationContext ctx=new GenericXmlApplicationContext("classpath:applicationCTX_ex14.xml");
		//#1. 빈의 scope속성은 기본이 singleton이다.
		//		- 기본 생성자 두 번 불렀지만... 한번만 생성자 호출 (싱글턴)
		//		- 인수 2개 생성자 두 번 불렀지만... 한번만 생성자 호출 (싱글턴)
		
		//#2. 빈의 scope 속성에 prototype을 적용한 후, 다시 실행!!
		//		- 매번 생성자 호출, 즉 인스턴스가 다르다는 뜻
		//		- 그렇다면 해시코드가 다르다!!
		Student student1=ctx.getBean("student1",Student.class);
		Student student2= ctx.getBean("student1",Student.class);
		
		Student student3=ctx.getBean("student2",Student.class);
		Student student4= ctx.getBean("student2",Student.class);
		
		//#1] 에서는 같다 같다 다르다
		//#2] 에서는 다르다, 다르다, 다르다
		System.out.println(student1==student2?"같다":"다르다");
		System.out.println(student3==student4?"같다":"다르다");
		System.out.println(student1==student3?"같다":"다르다");

	}
}
