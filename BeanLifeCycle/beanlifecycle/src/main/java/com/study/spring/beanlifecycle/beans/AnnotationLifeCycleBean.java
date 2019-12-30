package com.study.spring.beanlifecycle.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Bean lifeycle callbacks with JSR annotations.
 * @author c_navdeep.singh
 *
 */
public class AnnotationLifeCycleBean
{
	@PostConstruct
	public void afterInit()
	{
		System.out.println("Annotated method called after bean initialization complete");
	}
	
	@PreDestroy
	public void beforeDestroy()
	{
		System.out.println("Annotated method called before bean destroyed.");
	}
}
