package com.study.spring.awarebeans.beans;

import javax.annotation.PostConstruct;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

/**
 * App context aware bean.
 * Note 2 ways of getiing hold of app context:
 * 		implementing ApplicationContextAware
 * 		or through DI
 * @author c_navdeep.singh
 *
 */
public class AppContextAwareBean// implements ApplicationContextAware
{
	@Autowired
	private ApplicationContext appContext;

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException
	{
		this.appContext = applicationContext;
	}
	
	/*
	 * Note that aware context interface methoda are processed before 
	 * lifecycle callbacks methods, allowing to get us a hold of app context
	 * in this case.
	 */
	@PostConstruct
	public void after()
	{
		System.out.println("Application context is: " + this.appContext);
	}
}
