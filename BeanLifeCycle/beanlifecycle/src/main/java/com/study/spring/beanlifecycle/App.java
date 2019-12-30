package com.study.spring.beanlifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext ctx = new 
    			AnnotationConfigApplicationContext(
    					"com.study.spring.beanlifecycle.config");
    	ctx.start();
    	
    	ctx.getBean("SpringLifeCycleBean");
    	ctx.getBean("AnnotationLifeCycleBean");
    	ctx.getBean("lifeCycleBean");
    	
    	ctx.stop();//LifeCycle interface stop method called
    	ctx.close();//@PreDestroy annotated method or destroy() method called.
    }
}
