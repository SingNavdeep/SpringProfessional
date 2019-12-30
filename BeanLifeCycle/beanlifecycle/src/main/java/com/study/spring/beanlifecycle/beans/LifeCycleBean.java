package com.study.spring.beanlifecycle.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.Lifecycle;

/**
 * a bean implementing Spring's Lifecycle interface
 * @author c_navdeep.singh
 *
 */
public class LifeCycleBean implements Lifecycle
{
	private boolean isRunning = false;
	
	/*
	 * @PostConstruct public void afterInit() { isRunning = true;
	 * System.out.println("After init method called"); }
	 * 
	 * @PreDestroy public void beforeDestroy() { isRunning = false;
	 * System.out.println("Before destroy method called"); }
	 */
	
	/**
	 * NOTE:::start method not called although stop is called .
	 * Check in Spring boot project
	 */
	public void start()
	{
		System.out.println("Lifecycle interface start() called");
	}

	public void stop()
	{
		System.out.println("Lifecycle interface stop() called");
	}

	public boolean isRunning()
	{
		return true;
	}
	
}
