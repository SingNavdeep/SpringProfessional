package com.study.spring.lookupmethodcontextaware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.study.spring.lookupmethodcontextaware.beans.PizzaShop;


public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext ctx = new 
    			AnnotationConfigApplicationContext(
    					"com.study.spring.lookupmethodcontextaware.config");
    	PizzaShop ps = (PizzaShop)ctx.getBean("pizzaShop");
    	System.out.println("Pizza:" + ps.makePizza());
    	System.out.println("Another Pizza:" + ps.makePizza());
    }
}
