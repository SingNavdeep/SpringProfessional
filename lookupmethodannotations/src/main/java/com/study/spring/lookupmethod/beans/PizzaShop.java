package com.study.spring.lookupmethod.beans;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class PizzaShop
{
	//private Pizza pizza;
	
	public PizzaShop() {
	 }
	 
//	public PizzaShop(Pizza aPizza)
//	{
//		this.pizza = aPizza; 
//	}
	
	@Lookup
	public Pizza makePizza() 
	{ 
		return null; 
	}
	 
	/*
	 * @Lookup public Pizza getPizza() { return null; }
	 */
	 
}
