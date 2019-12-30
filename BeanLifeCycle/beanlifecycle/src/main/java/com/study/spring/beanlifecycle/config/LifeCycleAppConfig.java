package com.study.spring.beanlifecycle.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.study.spring.beanlifecycle.beans.AnnotationLifeCycleBean;
import com.study.spring.beanlifecycle.beans.LifeCycleBean;
import com.study.spring.beanlifecycle.beans.SpringLifecycleInterfaceBean;

@Configuration
public class LifeCycleAppConfig
{
	@Bean("SpringLifeCycleBean")
	public SpringLifecycleInterfaceBean getSpringLifeCycleInterfaceBean()
	{
		return new SpringLifecycleInterfaceBean();
	}
	
	@Bean("AnnotationLifeCycleBean")
	public AnnotationLifeCycleBean getAnnotatedlifeCycleBean()
	{
		return new AnnotationLifeCycleBean();
	}
	
	@Bean("lifeCycleBean")
	public LifeCycleBean getLifecycleBean()
	{
		return new LifeCycleBean();
	}
}
