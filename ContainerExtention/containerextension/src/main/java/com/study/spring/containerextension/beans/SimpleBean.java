package com.study.spring.containerextension.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.Lifecycle;

public class SimpleBean implements Lifecycle
{
	public void SimpleBean()
	{
		System.out.println("Simple Bean constructor called.");
	}
	
	@PostConstruct
	public void after()
	{
		System.out.println("bean's postconstruct method called");
	}
	
	@PreDestroy
	public void beforeDestroy()
	{
		System.out.println("Bean's before destroy method called");
	}
	
	public void start()
	{
		System.out.println("Bean lifecycle start method called.");
		
	}

	public void stop()
	{
		System.out.println("Bean lifecycle stop method called.");
	}
	
	public boolean isRunning() {
		// TODO Auto-generated method stub
		return false;
	}

}
