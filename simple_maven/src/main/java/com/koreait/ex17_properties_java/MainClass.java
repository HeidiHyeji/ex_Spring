package com.koreait.ex17_properties_java;

import java.io.IOException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx
		=new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		AdminConnection adminConnection=ctx.getBean("adminConfig",AdminConnection.class);

		System.out.println(adminConnection.getAdminId());
		System.out.println(adminConnection.getAdminPw());
		System.out.println(adminConnection.getAdmin_subId());
		System.out.println(adminConnection.getAdmin_subPw());

	}
}
