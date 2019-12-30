package com.study.spring.lookupmethodcontextaware.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.study.spring.lookupmethodcontextaware.beans.Pizza;
import com.study.spring.lookupmethodcontextaware.beans.PizzaShop;

@Configuration
public class ContextAwareLookupConfig
{
	@Bean("pizza")
	@Scope("prototype")
	public Pizza getPizza()
	{
		return new Pizza();
	}
	
	@Bean("pizzaShop")
	public PizzaShop getPizzaShop()
	{
		return new PizzaShop();
	}
	
}
