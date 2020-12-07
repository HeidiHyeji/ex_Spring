package com.koreait.ex16_properties_xml;

import java.io.IOException;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.support.ResourcePropertySource;

public class MainClass {
	public static void main(String[] args) {
		AbstractApplicationContext ctx= new GenericXmlApplicationContext("classpath:applicationCTX_ex16.xml");
		
		AdminConnection adminConnection=ctx.getBean("adminConnection",AdminConnection.class);
		System.out.println(adminConnection.getAdminId());
		System.out.println(adminConnection.getAdminPw());
		System.out.println(adminConnection.getAdmin_subId());
		System.out.println(adminConnection.getAdmin_subPw());

	}
}
