package com.study.spring.aspects.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.study.spring.aspects.beans.Employee.DummyObject;
import com.study.spring.aspects.exception.DummyException;

@Component
@Aspect
public class EmployeeAspect {

	// a pointcut selecting get join points(get methods) that are public, have any
	// return type and accepts no params
	@Pointcut("execution(public * com.study.spring.aspects.beans.*.get*())")
	public void getExecutionPointcut() {

	}

	// a pointcut selecting set join points in employee class having only 1 argument
	// as string
	// having void return type
	@Pointcut("execution(public void com.study.spring.aspects.beans.Employee..set*(String))")
	public void setExecutionPointcut() {

	}
	
	/**
	 * 
	 * Above pointcut could also be written as below.
	 * 
	 * In addition, the params passed to point cut can be accessed by args as below
	 * and then can be accessed in advice.
	 * Also, pointcuts are restricted to methods that accept a String as argument
	 */
	@Pointcut("execution(public void com.study.spring.aspects.beans.Employee..set*(..)) && args(name)")
	public void setExecutionParamPointcut(String name) {
		
		
	}
	/**
	 * a pointcut to select all methods within employee class
	 */
	@Pointcut("within(com.study.spring.aspects.beans.Employee)")
	public void afterExecutionPointcut()
	{
		
	}

	@Before("getExecutionPointcut()")
	public void beforeGetAdvice(JoinPoint jp) {
		System.out.println("Executing advice BEFORE getter on method: " + jp.toShortString());
	}

	@Before("setExecutionParamPointcut(name)")
	public void beforeSetAdvice(JoinPoint jp, String name) {
		System.out.println("Executing advice BEFORE setter on method: " + jp.toShortString());
		System.out.println("Setting name: " + name);
	}

	/*
	 * // after returning can have return value of join point as below // NOTE: name
	 * in returning parameter in advice expr and parameter name in advice // method
	 * should // match the type of advice method parameter restricts the join
	 * points.
	 * Below matches only methods returning strings
	 */	
	@AfterReturning(pointcut = "getExecutionPointcut()", returning = "retVal")
	public void afterGetAdvice(JoinPoint jp, String retVal) {
		System.out.println("Executing advice AFTER getter on method: " + jp.toShortString());
		System.out.println("Return val is: " + retVal);
	}

	//AND this matches only methods returning DummyObject
	@AfterReturning(pointcut = "getExecutionPointcut()", returning = "retVal")
	public void afterGetAdvice(JoinPoint jp, DummyObject retVal) {
		System.out.println("Executing advice AFTER getter on method: " + jp.toShortString());
		System.out.println("Return val is: " + retVal);
	}

	@AfterReturning(pointcut = "setExecutionPointcut()")
	public void afterSetAdvice(JoinPoint jp) {
		System.out.println("Executing advice AFTER setter on method: " + jp.toShortString());
	}

	/**
	 * 
	 * AfterThrowing advice executed after join point throws an exception
	 * The thrown exception can be caught as below.
	 * Also the exception type in advice method restricts the join points
	 * For eg: below is executed only on methods throwing DummyException
	 * 
	 */
	@AfterThrowing(pointcut = "within(com.study.spring.aspects.beans.Employee)", throwing = "ex")
	public void afterExceptionThrown(JoinPoint jp, DummyException ex) {
		System.out.println("Exception " + ex.getMessage() + " thrown by " + jp.toShortString());
	}
	
	/**
	 *
	 * After advice executed after every method execution completed either normally or 
	 * by throwing an exception.
	 * 
	 */
	@After("afterExecutionPointcut()")
	public void afterAll(JoinPoint jp)
	{
		System.out.println("AFTER execution advice executed on: " + jp.toShortString());
	}
	
	/**
	 * 
	 * select setter joinpoints in beans package that accept a single String as an argument. 
	 * 
	 */
	@Around("execution(public void com.study.spring.aspects.beans.*.set*(..)) && args(name)")
	public void proceedOnGetter(ProceedingJoinPoint pjp, String name)
	{
		if(name.equalsIgnoreCase("defaultname"))
		{
			System.out.println("AROUND Advice calling setter for: " + pjp.toShortString() + " for value " + name);
			try {
				pjp.proceed();
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("AROUNF advice skipped calling method: " + pjp.toShortString() + " for value " + name);
		}
	}
}
