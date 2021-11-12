package com.exam.sample.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.exam.sample.service.CustomOAuth2UserService;


@EnableWebSecurity 
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private CustomOAuth2UserService customOAuth2UserService;

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
	// 인증을 위한 사용자 설정
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		System.out.println("SecurityConfig.configure.AuthenticationManagerBuilder");
	}

	//Security Filter Chain과 관련된 설정을 진행하며 주로 제외할 경로 설정
	@Override
	public void configure(WebSecurity web) throws Exception {
		System.out.println("SecurityConfig.configure.WebSecurity");
	}

	//1. 인증 절차에 관한 설정: 어떤 경로에 대해서 적용할 것인지, 로그인, 로그아웃 형식 등 설정
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		System.out.println("SecurityConfig.configure.HttpSecurity");
		http.authorizeRequests()
        .anyRequest()	// 모든 요청 허용.
        .permitAll()
    .and()
        .logout()
        .logoutSuccessUrl("/")	
    .and()
        .oauth2Login()
        .defaultSuccessUrl("/login_success")
        .userInfoEndpoint()
        .userService(customOAuth2UserService);	
	}

}
