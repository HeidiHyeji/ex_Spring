package com.koreait.ex11_java_in_xml;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//MainClass에서 설정 자바 파일이야 하려면...
//여기에 어노테이션을 달아야한다.
@Configuration
public class ApplicationConfig {
	//빈이 들어있다 ->주입
	@Bean
	public Student student1(){
		//3개는 생성자  2개 setter
		ArrayList<String> ho=new ArrayList<String>();
		ho.add("독서");
		ho.add("식도락");
		Student st=new Student("학생1", 12, ho );
		
		st.setHeight(178);
		st.setWeight(67.1);
		
		return st;//st는 student1에 대입된다.
					//MainClass에서 student1을불러오면 st의 값이 대입된다.
	}
}
