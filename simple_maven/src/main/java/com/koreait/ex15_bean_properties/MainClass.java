package com.koreait.ex15_bean_properties;

import java.io.IOException;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.support.ResourcePropertySource;

public class MainClass {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext();

		// ctx라는 컨테이너는 getBean을 가져오는 게 아니라..
		// properties를 가져와야하는데... 이 properties를 가져오기 위해
		// 컨테이너 영역중에 환경 설정 영역을 가져다 놔야한다.
		ConfigurableEnvironment configEnv = ctx.getEnvironment();
		
		// 환경설정 객체에 소스를 알려주기 위해서 (admin.properties 파일)
		// 클래스 패스를 걸기 위한 객체를 생성한다.
		MutablePropertySources propertySources = configEnv.getPropertySources();

		// 모든 환경 준비는 끝났다. propertySources에게 admin.properties파일을 classpath로 주입하자
		// 이때 사용하는 메서드가 addLast() 메서드 이다.
		// addLast(문자열) //이 문자열이 제대로 활동할 수 있게 인코딩 값을 설정할 수 있는
		// ResourcePropertySource 클래스로 주입한다. 대신, try catch로 인셉션 체크
		try {
			propertySources.addLast(new ResourcePropertySource("classpath:admin.properties"));// alt+shif+Z:
																								// trycatch자동완성
			System.out.println(configEnv.getProperty("admin.id")+"-Envrionment가 호출");
			System.out.println(configEnv.getProperty("admin.pw")+"-Envrionment가 호출");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 이제서야 데이터를 사용할 준비를 마쳤다.
		// 환경 설정 영역에 있는 데이터를 AdminConnection 클래스의 객체와
		// 연결해 주면 된다.
		// #1. 컨테이너(ctx)에 configEnv 이름으로 데이터 주입!!
		// #2. 어디서 이 환경 설정을 사용할 건대?xml에서 사용할 거임!
		// #3. GenericXml 클래스가 xml을 파싱하고 load, refresh등을 할 수 있다.
		// #4. (환경 설정 영역을 갖고 있는) ctx를 형변환 시키자
		GenericXmlApplicationContext gCtx = (GenericXmlApplicationContext) ctx;

		gCtx.load("applicationCTX_ex15.xml");
		gCtx.refresh();//refresh(초기화)되면서 setEnvironment()와 afterPropertiesSet() 호출

		// 빈얻어오기
		AdminConnection adminConnection = gCtx.getBean("adminConnection", AdminConnection.class);

		// 값출력해보기
		System.out.println("Main에서 Id: " + adminConnection.getAdminId());
		System.out.println("Main에서 Pw: " + adminConnection.getAdminPw());

		gCtx.close();
		ctx.close();
	}
}
