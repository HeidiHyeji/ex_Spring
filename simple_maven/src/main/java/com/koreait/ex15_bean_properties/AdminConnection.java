package com.koreait.ex15_bean_properties;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
																		//setEnv()				//after~~()
public class AdminConnection implements EnvironmentAware,InitializingBean{
	private Environment env; //
	private String adminId;
	private String adminPw;
	
	//컨테이너 생성-> ctx
	//컨테이너 영역 중에 환경을 저장하는 영역 getEnvironment()
	//꺼내온 환경 정보를 가져오기 위한 메서드를 재정의 해야한다.
	// 				(주입 받기 위한)
	//			 EnvironmentAware 인터페이스에 환경설정 정보를 다루는
	//				메서드들이 정의되어있다! -> setEnvironment(환경설정정보)
	//														환경설정 정보를 주입받을 수 있는
	//														객체를 인스턴스로 준비시켜야 한다.
	//														"Environment" 객체 준비
	//			 빈 만들 때 이 메서드가 발동되어야한다.
	//				InitializingBean -> afterPropertiesSet() 메서드 정의
	public AdminConnection() {
		// TODO Auto-generated constructor stub
	}
	public AdminConnection(String adminId, String adminPw) {
		super();
		this.adminId = adminId;
		this.adminPw = adminPw;
	}
	public void setEnv(Environment env) {
		this.env = env;
	}
	public Environment getEnv() {
		return env;
	}
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getAdminPw() {
		return adminPw;
	}
	public void setAdminPw(String adminPw) {
		this.adminPw = adminPw;
	}
	
	//alt_shift_s+v
	@Override
	public void setEnvironment(Environment environment) {
		// TODO Auto-generated method stub
		System.out.println("-------setEnvironment--------");
		//environment로 넘어온 설정 정보를 env에 넘겨 주자!!
		//after메서드보다 먼저 실행한다.
		//setEnv(environment);//외부에서 사용
		env=environment;
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("------------------------------");
		System.out.println("Initial 인터페이스 구현");
		//프로퍼티 준비가 끝난 후 
		//(데이터를 입력받을 수 있는 객체가 만들어진 후)
		//데이터가 잘 주입됬니?-->setEnvironment가 미리 데이터를 세팅시켜 놓는다
		//"그래서 그 후 "
		//누가 먼저냐? 데이터 주입후(setEnvironment) , 현재 메서드(afterPropertiesSet)가 실행되도록 설계됨
		System.out.println(env.getProperty("admin.id")+"-AdminConnection클래스에서 호출");
		System.out.println(env.getProperty("admin.pw")+"-AdminConnection클래스에서 호출");

		//데이터가 잘 넘어온 것을 확인했다면....
		//주입하자!!!
		setAdminId(env.getProperty("admin.id"));
		setAdminPw(env.getProperty("admin.pw"));
		
		//이 클래스의 설정 정보가 xml에 들어가 있다.
		//Main에서 꺼내오자!
		
	}

	

}
