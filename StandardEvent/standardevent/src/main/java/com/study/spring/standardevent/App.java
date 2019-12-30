package com.study.spring.standardevent;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Standard events handling
 * @author c_navdeep.singh
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext ctx = new 
    			AnnotationConfigApplicationContext(
    					"com.study.spring.standardevent");
    	ctx.stop();
    	ctx.close();
    }
}
