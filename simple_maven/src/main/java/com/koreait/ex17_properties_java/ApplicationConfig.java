package com.koreait.ex17_properties_java;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * #1 어노테이션 붙이기
 * : 이 클래스의 어노테이션을 주목하라! 
 * 그래서 MainClass에서 AnnotationConfig~~로 찾는다
 * 
 * #2. 빈 객체를 리턴하는 메서드 만들기
 * 	(메서드 이름은 id를 대체하게 된다)
 *	 	"빈 객체를 리턴하고 있다"라는 어노텐이션을 붙인다.
 *		 @Bean 
 *		 Public 클래스 메서드id(){
 * 			return 객체;	//여러개일 때는 배열로..
 *  	 }
 * 	
 * 	*properties파일이 여러개 있을 때는 자원(Resource)클래스를 만들어서
 * 		배열로 담은 후 리턴하면 된다.
 *
 */
@Configuration
public class ApplicationConfig {
/*	 
 * * #1. 프로퍼티가 한개일때
  	@Bean
	public static PropertySourcesPlaceholderConfigurer Properties(){
		PropertySourcesPlaceholderConfigurer configurer
		=new PropertySourcesPlaceholderConfigurer();//구성 정보를 가져올 수 있게 객체생성
		
		//configurer한테 어떤파일인지를 알려줘야함(넣어줘야함)-->serLocation()
		//어떤(어디) classpath
		ClassPathResource location = new ClassPathResource("admin.properties");
		//configurer한테 리소스의 위치(location)을 주입시키자!
		configurer.setLocation(location);
		
		return configurer;
		
	}*/

	 // #2. 프로퍼티가 두개일때
	  	@Bean
		public static PropertySourcesPlaceholderConfigurer Properties(){
			PropertySourcesPlaceholderConfigurer configurer
			=new PropertySourcesPlaceholderConfigurer();//구성 정보를 가져올 수 있게 객체생성
			
			//configurer한테 어떤파일인지를 알려줘야함(넣어줘야함)-->serLocation()
			//어떤(어디) classpath
			//ClassPathResource클래스의 상위 인터페이스=Resource
			Resource resources[]= new Resource[2];
			resources[0]=new ClassPathResource("admin.properties");
			resources[1]=new ClassPathResource("admin_sub.properties");

			//configurer한테 리소스의 위치(location)을 주입시키자!
			configurer.setLocations(resources);
			
			return configurer;
			
		}
	  	
	  	//이 설정파일 ApplicationConfig를 이용해서 각각의 프로퍼티에 들어갈
	  	//데이터를 설정해 놓는다.
	  	// admin, admin_sub에 필드들....2개씩 4개.. 여기에 넣을 데이터를 주입한다.
	  	
	  	//MainClass에서 configuerer를 사용하려면...?
	  	//ApplicationConfig 에 Properties()를 호출해야한다.  
	  	
	  	//Properties를 호출하면 그 안에 데이터를 불러 올 수 있다는 얘긴데...
	  
	  	//아래에 그 필드에 들어갈 내용을 주입시켜 놓는다.
	  	/*
	  	 * 사용할 어노테이션
	  	 * @Value(값)
	  	 * 클래스의 인스턴스 변수기재!
	  	 */
	  	
	  	//Properties()메서드가 static이여서 별도로 호출하지 않아도 컨테이너에서 바로 끌어올수 있다.
	  	@Value("${admin.id}") //프로퍼티에서 읽어온 값
	  	private String adminId; //변수 adminId에 넣어주자!
	  	
	  	@Value("${admin.pw}")
	  	private String adminPw;
	  	
	  	@Value("${admin_sub.id}")
	  	private String admin_subId;
	  	
	  	@Value("${admin_sub.pw}")
	  	private String admin_subPw; //주입은 끝났다!!
	  	
	  	//위에 있는 데이터를 가져와서 사용할 객체를 리턴할
	  	//메서드를 만들자!
	  	@Bean 
	  	public AdminConnection adminConfig(){//설정된 정보를 밖으로 인계해주는 클래스
	  		
	  		AdminConnection adminConnection=new AdminConnection();
	  		
	  		adminConnection.setAdminId(adminId);
	  		adminConnection.setAdminPw(adminPw);
	  		adminConnection.setAdmin_subId(admin_subId);
	  		adminConnection.setAdmin_subPw(admin_subPw);
	  		
	  		return adminConnection;
	  	}
	  	
	  	
	  	
	  	
	
}
