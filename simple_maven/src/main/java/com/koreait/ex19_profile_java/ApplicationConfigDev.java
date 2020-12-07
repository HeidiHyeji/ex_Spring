package com.koreait.ex19_profile_java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

//# 이 클래스는 설저 정보(config)를 담고 있는 클래스이다.
//# 어노테이션으로 그 설정 정보를 "표시"해두면 
//		MainClass의 AnnotationConfigApplicationContext()가 이 파일을 찾게 된다.
//		이 파일을 찾게 된다.(스프링 컨테이너=IoC 컨테이너=<ApplicationContext

//# 이 클래스 파일을 인식하는 표시로 
//		Profile이라는 어노테이션을 달아 놓으면 이 클래스 파일을 "주입"할 수 있게 된다

//# 컨테이너한테 실행하고 명령하면 "주입"된 프로필 내용을 보고 알아서 선택/실행 하게 된다

//#1. config 어노테이션 달기
//#2. Profile("dev")어노테이션 달기
@Configuration	//<--MainClass에서 사용할 어노테이션
@Profile("dev")		//<-- dev로 표시를 남겨놓자! setActiveProfile()
public class ApplicationConfigDev {
	//#3. 메서드 하나 만들어서 사용할 객체 리턴 시키기!
	//빈 객체 리턴한다는 뜻으로 메서드에다 bean어노테이션 달아주기!!
	//데이터를 주입할 Target클래스가 뭐니?
	@Bean	//serverInfo 메서드명을 id로 사용할 수 있다
				//이 이름은 MainClass에서 getBean()이 사용할 이름이다
				//그래서 xml의 id역할을 수행한다
				//그렇다면 applicatioConfigRun 클래스에서도
				//똑같은 serverInfo 라는 메서드명으로 만들어야겠다.!
	public ServerInfo serverInfo(){
		ServerInfo info= new ServerInfo();
		info.setIp("192.168.3.17");
		info.setPort("8282");
		return info;
	}
}
