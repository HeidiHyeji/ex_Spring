package com.koreait.ex06_constructorArg;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		String config = "classpath:applicationCTX_ex06.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(config);

		//인스턴스를 구했다->객체에 대입시킬수있다.
		//2.생성자 방식
		StudentInfo si = ctx.getBean("studentInfo", StudentInfo.class);
		si.printStudentInfo();
		
		//studentInfo라는 객체는 위에처럼 비즈니스메서드를 불렀다
		//setter도 부를 수 있다
		//밑애다가 내 정보를 xml로 만들어 놓은 다음
		//ctx로 getBean해서 주입할 거다..
		//그리고 다시 print할 거다
		//1. setter방식
		Student student=ctx.getBean("student2", Student.class);
		si.setStudent(student);
		si.printStudentInfo();
		
		ctx.close();//자원 해제
	}

}
