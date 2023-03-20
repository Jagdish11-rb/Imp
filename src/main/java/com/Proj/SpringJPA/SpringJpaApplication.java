package com.Proj.SpringJPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScan("com.myapp.repositories")
//@EnableAutoConfiguration
//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SpringJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaApplication.class, args);
	}
}
