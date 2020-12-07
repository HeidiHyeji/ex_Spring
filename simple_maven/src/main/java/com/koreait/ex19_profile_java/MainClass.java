package com.koreait.ex19_profile_java;

import java.util.Scanner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String config = "";
		while (true) {
			System.out.println("dev/run중에 입력하시오.");
			String choice = sc.next();

			if (choice.equals("dev")) {
				config = "dev";
				break;
			} else if (choice.equals("run")) {
				config = "run";
				break;
			} else {
			}
		}
		// #1. 클래스 가져오는 컨테이너 만들기
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

		// #2. 선택한 서버이름(config)주입하기
		ctx.getEnvironment().setActiveProfiles(config);

		// #3. "등록"(사용할 자바 파일 등록)
		// load가 들어갈 자리에 대신register(가변인수)가 들어가야함
		ctx.register(ApplicationConfigDev.class, ApplicationConfigRun.class);

		// #4. 초기화
		ctx.refresh();

		// #5. 객체 생성
		ServerInfo info = ctx.getBean("serverInfo", ServerInfo.class);

		// #6. 메서드 호출 getInfo()
		System.out.println(info.getIp());
		System.out.println(info.getPort());

		// #7. 닫기 - 자원 해제
		ctx.close();
	}
}
