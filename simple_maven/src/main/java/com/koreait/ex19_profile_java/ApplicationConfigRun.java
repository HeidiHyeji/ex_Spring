package com.koreait.ex19_profile_java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("run")
public class ApplicationConfigRun {
	@Bean
	public ServerInfo serverInfo(){
		ServerInfo info= new ServerInfo();
		info.setIp("localhost");
		info.setPort("8181");
		return info;
	}

}
