package com.exam.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * https://docs.spring.io/spring-boot/docs/current/reference/html/using-spring-boot.html#using-boot-using-springbootapplication-annotation

 * 
 *  @SpringBootApplication 는 다음 3가지 기능을 포함한다.
  
    -@EnableAutoConfiguration: enable Spring Boot’s auto-configuration mechanism
	-@ComponentScan: enable @Component scan on the package where the application is located (see the best practices)
    -@Configuration: allow to register extra beans in the context or import additional configuration classes

 * 
 */

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
