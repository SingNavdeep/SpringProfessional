package com.study.spring.awarebeans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext ctx = new 
    			AnnotationConfigApplicationContext(
    					"com.study.spring.awarebeans");
    	
    	ctx.getBean("appContextAware");
    }
}
