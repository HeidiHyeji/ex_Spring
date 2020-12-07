package com.koreait.ex05_xml_property;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.koreait.ex0110_spring_di.MyCalculator;

public class MainClass {

	public static void main(String[] args) {
		String config="classpath:applicationCTX_ex05.xml"; //콜론!!!
		AbstractApplicationContext ctx=new GenericXmlApplicationContext(config);
		//new GenericXmlApplicationContext(config,config2,config3....);
		
		//ctx객체는 xml을 읽어온 상태다.
		//거기서 필요한 객체 bean을 가져와서 인스턴스를 생성해주면 된다.
		MyInfo mi=ctx.getBean("myInfo",MyInfo.class);
		mi.getInfo();
		
	}

}
