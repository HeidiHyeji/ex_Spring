package com.koreait.ex0110_spring_di;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args){
		
		/*//의존하고 있다.
		MyCalculator mc=new MyCalculator();
		
		//주입하고 있다.
		mc.setCalculator(new Calculator());
		mc.setFirstNum(10);
		mc.setSecondNum(2);*/
		
		//#1. xml의 경로(파일명)를 적어준다
		//#2. 파싱 클래스 GenericXmlApplicationContext(경로);
		//#3. AbstractApplicationContext에 다형적 대입
		//#4. getBean() 메서드를 호출해 사용할 객체를 가져오자
		//#5. 메서드 호출!
		String classPath="classpath:applicationCTX_ex04.xml"; //콜론!!!
		AbstractApplicationContext ctx=new GenericXmlApplicationContext(classPath);
		
		//ctx객체는 xml을 읽어온 상태다.
		//거기서 필요한 객체 bean을 가져와서 인스턴스를 생성해주면 된다.
		MyCalculator mc=ctx.getBean("myCalculator",MyCalculator.class);
		
		
		mc.add();
		mc.sub();
		mc.mul();
		mc.div();
	}
}
