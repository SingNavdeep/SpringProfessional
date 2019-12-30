package com.study.spring.lookupmethodcontextaware.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class PizzaShop implements ApplicationContextAware
{
	private ApplicationContext ctx = null;

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException
	{
		this.ctx = applicationContext;
	}
	
	public Pizza makePizza()
	{
		return ctx.getBean(Pizza.class);
	}
}
