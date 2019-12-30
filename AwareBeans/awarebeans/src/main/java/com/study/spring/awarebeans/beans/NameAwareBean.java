package com.study.spring.awarebeans.beans;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.BeanNameAware;

/**
 * a name aware bean
 * @author c_navdeep.singh
 *
 */
public class NameAwareBean implements BeanNameAware
{
	private String beanName;

	public void setBeanName(String name)
	{
		this.beanName = name;
	}
	
	@PostConstruct
	public void after()
	{
		System.out.println("Bean " + beanName + " initialized");
	}
}
