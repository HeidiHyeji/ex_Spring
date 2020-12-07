package com.koreait.ex12_xml_in_java;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

//MainClass에서 설정 자바 파일이야 하려면...
//여기에 어노테이션을 달아야한다.
@Configuration
@ImportResource("classpath:applicationCTX_ex12.xml")//자원이어딨는지 classpath로 알려준다//student2정보
public class ApplicationConfig {
	//빈이 들어있다 ->주입
	@Bean
	public Student student1(){
		//3개는 생성자  2개 setter
		ArrayList<String> ho=new ArrayList<String>();
		ho.add("독서");
		ho.add("식도락");
		Student st=new Student("학생1", 12, ho );
		
		st.setWeight(178);
		st.setHeight(67.1);
		
		return st;//st는 student1에 대입된다.
					//MainClass에서 student1을불러오면 st의 값이 대입된다.
	}
}
