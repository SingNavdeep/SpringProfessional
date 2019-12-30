package com.study.spring.beaninheritance;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext ctx = new 
    			AnnotationConfigApplicationContext(
    					"com.study.spring.beaninheritance.config");
    	ctx.getBean("parentBean");
    	ctx.getBean("childBean");
    }
}