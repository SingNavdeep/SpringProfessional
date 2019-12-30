package com.study.spring.lookupmethodjava;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.study.spring.lookupmethodjava.beans.Pizza;
import com.study.spring.lookupmethodjava.beans.PizzaShop;

@Configuration
public class LookupMethodJavaConfig
{
	@Bean(name="pizza")
	@Scope("prototype")
	public Pizza getPizza()
	{
		return new Pizza();
	}
	
	@Bean(name="pizzaShop")
	public PizzaShop getPizzaShop()
	{
		return new PizzaShop() {
			public Pizza makePizza()
			{
				return getPizza();
			}
		};
	}
}
