package com.study.spring.beaninheritance.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.study.spring.beaninheritance.beans.ChildClass;
import com.study.spring.beaninheritance.beans.ParentClass;

@Configuration
public class AppConfig
{
	@Bean("parentBean")
	public ParentClass getParentBean()
	{
		return new ParentClass();
	}
	
	@Bean("childBean")
	public ChildClass getChildBean()
	{
		return new ChildClass();
	}
}