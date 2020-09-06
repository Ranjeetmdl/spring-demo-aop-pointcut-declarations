package com.luv2code.aopdemo.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspects {
	
	@Pointcut("execution(* com.luv2code.aopdemo.dao.*.*(..))")
	public void forDaoPackage(){}
	
	@Before("forDaoPackage()")
	public void beforeAddAccountAdvice(){
		System.out.println("\n====>Executing @Before advice on method()");
	}
	
	@Before("forDaoPackage()")
	public void performAPIAnalytics(){
		System.out.println("\n====>Perform API analytics");
	}
	

}
