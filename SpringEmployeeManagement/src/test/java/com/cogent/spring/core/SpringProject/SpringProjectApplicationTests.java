package com.cogent.spring.core.SpringProject;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringProjectApplicationTests {

	@Test
	void contextLoads() {
	}
	
	String hi() {
		return "hello";
	}
	
	@BeforeEach
	void before() {
		System.out.println("b4 tests");
	}
	
	@AfterEach
	void after() {
		System.out.println("after tests");
	}
	
	@Test
	void sum() {
		System.out.println("int test hello");
		SpringProjectApplication spa = new SpringProjectApplication();
		assertEquals(4, spa.sum(2, 2));
	}
	
	@Test
	void strings() {
		SpringProjectApplication spa = new SpringProjectApplication();
		System.out.println("string test hello");
		assertEquals("hello", spa.stringHello());
	}
	
	@Test
	void booleans() {
		SpringProjectApplication spa = new SpringProjectApplication();
		System.out.println("boolean test hello");
		assertEquals(true, spa.booleans());
	}

}
