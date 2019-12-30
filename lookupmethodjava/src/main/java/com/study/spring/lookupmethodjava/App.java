package com.study.spring.lookupmethodjava;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.study.spring.lookupmethodjava.beans.PizzaShop;


public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext ctx = new 
    			AnnotationConfigApplicationContext(
    					"com.study.spring.lookupmethodjava");
    	PizzaShop ps = ctx.getBean(PizzaShop.class);
    	System.out.println("Pizza" + ps.makePizza());
    	System.out.println("Another Pizza" + ps.makePizza());
    }
}
