package com.study.spring.beanlifecycle.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * this POJO implements Spring's lifecycle interfaces for callbacks 
 * @author c_navdeep.singh
 *
 */
public class SpringLifecycleInterfaceBean implements InitializingBean, DisposableBean
{

	public void destroy() throws Exception
	{
		System.out.println("Method called before bean destroyed.");
	}

	public void afterPropertiesSet() throws Exception
	{
		System.out.println("Method called after bean initialization complete.");
	}
	
}
