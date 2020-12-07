package com.koreait.ex12_xml_in_java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		// 이번에는 자바 파일을 읽어오자!
		// 자바 파일안에는 std1, std2
		// 자바,xml(외부)
		// 외부:@ImportResource가 필요하다
		// 자바 설정파일:@Configuration이 있다
		// 그 어노테이션 설정된 파일이 내거다!!
		// 메서드 위해 @Bean이 붙어 있는데 그거 알아오는 클래스
		// -->
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		Student std1 = ctx.getBean("student1", Student.class);
		System.out.println(std1.getName());
		System.out.println(std1.getHeight());
		System.out.println(std1.getAge());
		System.out.println(std1.getWeight());
		System.out.println("=========================");

		// xml에서 자바 설정파일을 인식해야한다. @Configuration 어노테이션을
		// 인식시키기 위해 <context:어노테-config> 네임스페이스를 사용해야한다.
		// 네임스페이스를 사용 하려면 schema 등록을 해야한다.
		// (schema 등록은 xml의 namespaces 탭을 이용하자!)
		// #학생2 : 일반 xml 설정
		Student std2 = ctx.getBean("student2", Student.class);
		System.out.println(std2.getName());
		System.out.println(std2.getHeight());
		System.out.println(std2.getAge());
		System.out.println(std2.getWeight());
		System.out.println("=================================");
		ctx.close();
	}
}
