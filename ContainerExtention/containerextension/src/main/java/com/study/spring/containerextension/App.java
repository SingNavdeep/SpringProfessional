package com.study.spring.containerextension;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext ctx = new 
    			AnnotationConfigApplicationContext(
    					"com.study.spring.containerextension.config");
    	ctx.start();
    	ctx.getBean("simpleBean");
    	ctx.stop();//LifeCycle interface stop method called
    	ctx.close();//@PreDestroy annotated method or destroy() method called.
    }
}
