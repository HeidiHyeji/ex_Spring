package com.koreait.ex07_interface_pencil;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args){
		AbstractApplicationContext ctx
		= new GenericXmlApplicationContext("classpath:applicationCTX_ex07.xml");
		
		//인터페이스로 Bean을 불러도됨 <--다형성
		Pencil pencil=ctx.getBean("pencil",Pencil.class); 
		pencil.use();
		
		ctx.close();
	}
}
