package com.koreait.ex13_bean_life_cycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;



public class MainClass {
	public static void main(String[] args){
		
//		//#1. 기본 설정 가져오기
//		//-1) 생성
//		AbstractApplicationContext factory=new GenericXmlApplicationContext("classpath:applicationCTX_ex13.xml");
//		//-2) 사용
//		Student student1= factory.getBean("student1",Student.class);
//		
//		System.out.println("이름: "+student1.getName());
//		System.out.println("이름: "+student1.getAge());
//		factory.close();
//		
//		//#2, life-cycle :생성 로드 초기화 사용 소멸 
//		//1.생성
//		GenericXmlApplicationContext ctx=new GenericXmlApplicationContext(); 
//		
//		//#2. 로드+초기화
//		ctx.load("classpath:applicationCTX_ex13.xml");
//		ctx.refresh(); //설정 파일로 초기화 해라!
//		Student std1=ctx.getBean("student1",Student.class);
//		//학생2: 일반 xml 설정
//		System.out.println(std1.getName());
//		System.out.println(std1.getHeight());
//		System.out.println(std1.getAge());
//		System.out.println(std1.getWeight());
//		System.out.println("=========================");
		
		//#3. refresh할 때 자동 인계 -"콜백"
		//close() 자동 인계-"콜백"
		//Student클래스에 콜백할 메서드를 재정의 해주자!
//		GenericXmlApplicationContext ctx=new GenericXmlApplicationContext(); 	
//		ctx.load("classpath:applicationCTX_ex13.xml");
//		ctx.refresh(); //설정 파일로 초기화 해라!
//		Student std1=ctx.getBean("student1",Student.class);
//		System.out.println(std1.getName());
//		System.out.println(std1.getAge());
		
		//#4. 내일 ~~ OtherStudent클래스 만들어서
		//임의의 메서드를 콜백시키자!
		//대신 어노테이션을 달아야 콜백 된다
		//-->버전 때문에 annotation이 안된다
		//-->bean의 속성으로 annotation을 대체할 수 있따.
		GenericXmlApplicationContext ctx=new GenericXmlApplicationContext(); 	
		ctx.load("classpath:applicationCTX_ex13.xml");
		ctx.refresh(); //설정 파일로 초기화 해라!
		
		Student std=ctx.getBean("student1",Student.class);
		try {
			//std객체의 destroy()는 close()를 통해서 자동 소멸되는 콜백이었는데..
			//해당 임무를 수행하려고 명시적으로 호출하고 있다.
			std.destroy(); //특정 bean만 소멸시킨다.
								//이때 수행할 내용이 실행된다
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		OtherStudent otherStudent=ctx.getBean("otherStudent",OtherStudent.class);
		//other에서도 소멸시 실행할 메서드를 호출하려면??
		otherStudent.destroyMethod();//소멸할 때, 실행할 내용을
		//갖고 있는 메서드를 "콜백"시키지 말고..
		//바로 사용하고 싶어서 명시적으로 호출하고 있다.
		
		//ctx가 보유중인 모든 bean을 소멸시켜라
		ctx.close();
		
	}
}
