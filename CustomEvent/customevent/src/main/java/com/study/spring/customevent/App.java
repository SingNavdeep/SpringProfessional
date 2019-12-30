package com.study.spring.customevent;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.study.spring.customevent.beans.EventPublisher;

/**
 * custom events spring
 * @author c_navdeep.singh
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext ctx = new 
    			AnnotationConfigApplicationContext(
    					"com.study.spring.customevent");
    	
    	EventPublisher pubBean = ctx.getBean(EventPublisher.class);
    	pubBean.publishEvent("Event message published.");
    }
}
