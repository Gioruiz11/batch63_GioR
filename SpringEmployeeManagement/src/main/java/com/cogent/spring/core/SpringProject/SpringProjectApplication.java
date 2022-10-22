package com.cogent.spring.core.SpringProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// ^ equal to @enableautoconfiguration, @component, @configuration
public class SpringProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringProjectApplication.class, args);
		System.out.println("hello");
		System.out.println("yes hello");
	}
	
	
	
	
	
	public int sum(int a, int b) {
		return a + b;
	}
	
	public String stringHello() {
		return "hello";
	}
	
	public boolean booleans() {
		return true;
	}

}
