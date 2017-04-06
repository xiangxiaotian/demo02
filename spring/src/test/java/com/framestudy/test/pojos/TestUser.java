package com.framestudy.test.pojos;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.framestudy.spring.pojos.User;

public class TestUser {
	ApplicationContext ac=null;
	@Before
	public void before(){
		ac=new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
	}
	@Test
	public void testGetUser(){
		User user=(User) ac.getBean("user");
		System.out.println(user);
	}
	
}
