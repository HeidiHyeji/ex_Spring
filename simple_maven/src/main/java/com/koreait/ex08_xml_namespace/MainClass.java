package com.koreait.ex08_xml_namespace;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args){
		String config1="classpath:applicationCTX_ex09_1.xml";
		String config2="classpath:applicationCTX_ex09_2.xml";
		
		//가변인수로 ctx에게 conf1과 conf2를 다 넣을 수 있다
		//ctx에 모든 vean이 등록된다.
		AbstractApplicationContext ctx=new GenericXmlApplicationContext(config1,config2);
		
		// 현재까지 bean 목록: stdent1,studentInfo,family
		
		//stduent1가져올거다
		//stduentInfo 가져와서
		//위의 두개를 비교해보자(같은지 다른지)
		Student student1= ctx.getBean("student1",Student.class);
		System.out.println("-------------------");
		System.out.println(student1.getName());
		System.out.println(student1.getAge());
		System.out.println(student1.getHobby());
		
		Student student2= ctx.getBean("info",StudentInfo.class).getStudent();
		System.out.println("-------------------");
		System.out.println(student2.getName());
		System.out.println(student2.getAge());
		System.out.println(student2.getHobby());
		
		System.out.println("주입한 객체에서 student1을 가져왔다");
		System.out.println(student1==student2?"같은학생!":"다른학생!");
		
		//3번째 ex09_1
		//<bean> 홍길동과 똑같은 정보 <bean>
		//student1과 student3은 ==비교시
		//"다른 학생" 정보가 나와야한다.
		Student student3= ctx.getBean("student3",Student.class);
		System.out.println("-------------------");		
		System.out.println("student3를 새로 만들었다");
		System.out.println(student2.getName());
		System.out.println(student2.getAge());
		System.out.println(student2.getHobby());
		

		System.out.println(student1==student3?"같은학생!":"다른학생!");
		
		//==비교하면 데이터가 아무리 같아도 Hashcode를 비교하기 때문에 다르다고 나온다.
		//equals로 비교해야한다. 그러자면 hashcode하고 equals를 재정의 하면 된다
		System.out.println("equals비교시: "+(student1.equals(student3)?"갑음":"다름"));
		
		//ex09_2.xml에서도 student정보를 가져올 ㅜ 있다.
		//홍길자 15,독서 음악감상 160 44
		//ctx에서 꺼내오자
		Student student4= ctx.getBean("student4",Student.class);
		System.out.println("-------------------");		
		System.out.println("student4를 새로 만들었다");
		System.out.println(student4.getName());
		System.out.println(student4.getAge());
		System.out.println(student4.getHobby());
		
		
		Family family= ctx.getBean("family",Family.class);
		System.out.println("-------------------");		
		System.out.println("family를 새로 만들었다");
		System.out.println(family.getPapaName());
		System.out.println(family.getMamaName());
		System.out.println(family.getBrotherName());
		System.out.println(family.getSisterName());
		
		ctx.close();
	}
}
