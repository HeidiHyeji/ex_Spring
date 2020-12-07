package com.koreait.ex08_interface_calculator;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args){
		AbstractApplicationContext ctx=new GenericXmlApplicationContext("classpath:applicationCTX_ex08.xml");
		MyCalculator myCalculator=ctx.getBean("myCalculator",MyCalculator.class);
		
		myCalculator.addition();
		myCalculator.substraction();
		myCalculator.multiplication();
		myCalculator.divition();
		
	}
}
