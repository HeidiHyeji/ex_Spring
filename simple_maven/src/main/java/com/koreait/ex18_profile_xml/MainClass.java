package com.koreait.ex18_profile_xml;

import javax.swing.JOptionPane;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args){
		//(dev/run)둘 중에 하나의 정보를 가져오겠다.
		
		String choice=JOptionPane.showInputDialog("dev/run 중에 하나를 선택하시오");
		
		//설정 정보 저장용 변수
		String config="";
		
		if(choice.equals("dev")){
			config="dev";
		}
		else if(choice.equals("run")){
			config="run";
		}
//		else{
//			JOptionPane.showMessageDialog(null,"잘못입력하셨습니다.");
//		}
		//#1. 컨테이너를 생성해 놓는다.
		GenericXmlApplicationContext ctx=new GenericXmlApplicationContext();
		
		//#2. 생성된 컨테이너(ctx)에서 활용할 profile정보를 주입해야한다.
		//		프로파일 정보를 주입하는 컨테이너의 영역이 환경설정 영역이다.
		//		ctx.환경설정객체.setActiveProfile(config);
		ctx.getEnvironment().setActiveProfiles(config);
		
		//#3. 이 ctx에서 사용할 설정 정보(xml)을 읽어오자!
		ctx.load("applicationCTX_ex18_dev.xml","applicationCTX_ex18_run.xml");
		//Profile과 xml파일을 매칭시키는 거는 컨테이너인가? 
							//ctx가 알아서 매칭시킨다
		//load시킬때 "classpath:"라는 단어를 쓰지 않아도 되는가? 
							//파라미터가 여러개일 때는 classpath:를 굳이 쓰지 않아도 공통된 부분으로 알아서 찾지만
							//파라미터가 하나거나 생성자에 인자로 사용될때는 써주는 게 좋다!
							//또한, 주최가 자바일 경우, 쓰는 게 좋지만, 주최가 컨테이너인경우, 안써도 좋다!
		
		
		//#4. 설정 정보를 초기화 하자
		ctx.refresh();
		
		//#5. bean 객체를 얻어온 후..
		ServerInfo info=ctx.getBean("serverInfo",ServerInfo.class);
		
		//#6. get정보()하자
		System.out.println(info.getInfo());
//		System.out.println(info.getIp());
//		System.out.println(info.getPort());
		
		//#7. 닫기
		ctx.close();
	}
}
