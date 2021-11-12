package com.example.sample.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	//2. 인증 정보 관리 - in memory
    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
      return new BCryptPasswordEncoder();
    }
    
    @Autowired
	DataSource dataSource;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		System.out.println("SecurityConfig.configure(AuthenticationManagerBuilder auth)");
		System.out.println(passwordEncoder().encode("1234"));

		/*
		 * // 메모리 기반의 인증 정보 관리 auth.inMemoryAuthentication()
		 * .withUser("staff").password(passwordEncoder().encode("1234")).roles("STAFF")
		 * .and()
		 * .withUser("admin").password(passwordEncoder().encode("1234")).roles("ADMIN");
		 */	
		//2. JDBC 기반의 인증 정보 관리
		String userQuery = "select uid as username, upass as password, true as enabled "
				+ " from customer where uid=?";
		String authQuery = "select uid username, urole authority "
				+ " from customer where uid=?";
		auth.jdbcAuthentication()
			.dataSource(dataSource)  // DB 연결
			.rolePrefix("ROLE_")     // authority는 ROLE_{role_name} 형식
			.usersByUsernameQuery(userQuery)
			.authoritiesByUsernameQuery(authQuery);
	
	
	}
	
	
	
	
	//1. 인증 절차
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		System.out.println("SecurityConfig.configure(HttpSecurity http)");
		 http.authorizeRequests()
         .antMatchers("/").permitAll()
         .antMatchers("/staff/**").hasAnyRole("STAFF", "ADMIN")
         .antMatchers("/admin/**").hasRole("ADMIN");
		 
		//인증이 필요한 페이지는 login으로 redirect
		 http.formLogin()
		     .loginPage("/customlogin") //로그인 요청 페이지
		 	 .loginProcessingUrl("/mylogin") // 로그인 처리 페이지
//		 	 .defaultSuccessUrl("/") //로그인 성공시 이동 url
		 	 .usernameParameter("id") //사용자 아이디 필드의 이름
		 	 .passwordParameter("pw"); // 사용자 비번 필드의 이름
		 
		 
		 
		 http.logout()
	 	     .logoutUrl("/logout") // 요청 url 값(기본: logout)
	         .logoutSuccessUrl("/customlogin") //logout 성공시 이동 대상
	         .invalidateHttpSession(true);  // 세션을 모두 초기화
		 
	}


	
}







