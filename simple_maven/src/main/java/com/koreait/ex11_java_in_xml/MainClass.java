package com.koreait.ex11_java_in_xml;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args){
		//student1 student2
		//자바 			xml
		//ctx.getBean(student1)
		//ctx.getBean(student2)
		
		//학생1	<-- xml을 봐도 설정정보를 알 수 없다(자바에 만들어 놨다)
		//자바의 설정파일--> xml에 가져다놨다 ->xml을 가져와서 student1을 불러오자
		AbstractApplicationContext ctx =new GenericXmlApplicationContext("classpath:applicationCTX_ex11.xml");
		Student std1=ctx.getBean("student1",Student.class);
		System.out.println(std1.getName());
		System.out.println(std1.getHeight());
		System.out.println(std1.getAge());
		System.out.println(std1.getWeight());
		//xml에서 자바설정 파일을 인식해야 한다. @Configuration 어노테이션을 
		//인식시키기 위해 ~~~ 을 해야한다.
		//~~~을 하려면 schema 등록을 해야한다.
		//(schema등록은 xml의 namespace탭을 이용하자!)
		
		System.out.println("=========================");
		
		//학생2: 일반 xml 설정
		Student std2=ctx.getBean("student2",Student.class);
		System.out.println(std2.getName());
		System.out.println(std2.getHeight());
		System.out.println(std2.getAge());
		System.out.println(std2.getWeight());
		System.out.println("=========================");
		
	}
}
