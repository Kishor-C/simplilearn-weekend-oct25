package com.example;

import java.time.LocalDateTime;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectDemo {

	@Before("execution(* com.example.ProfileServiceImpl.createProfile(..))")
	public void beforeCreate() {
		LocalDateTime time = LocalDateTime.now();
		System.out.println("::Executed Before at: "+time+"::");
	}
	@After("execution(* com.example.ProfileServiceImpl.createProfile(..))")
	public void afterCreate() {
		LocalDateTime time = LocalDateTime.now();
		System.out.println("::Executed After at: "+time+"::");
	}
}
