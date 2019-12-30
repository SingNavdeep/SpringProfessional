package com.study.spring.container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.study.spring.container.beans.SecondBean;
import com.study.spring.container.beans.SecondBeanSetter;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx = new AnnotationConfigApplicationContext("com.study.spring.container.config");
    	
    	/**
    	 * NOTE: for below to work with Java config:
    	 * - either the bean should explicitly be defined with the name firstBean
    	 * - OR the method returning FirstBean instance must ne named firstBean() in config class.
    	 * OR use the overloaded method that takes in the class name.
    	 */
    	ctx.getBean("firstBean");
    	SecondBean sb = ctx.getBean(SecondBean.class);
    	System.out.println("First bean instance in contructor injection:" + sb.getfBean());
    	//ctx.getBean(FirstBean.class);
    	SecondBeanSetter sbs = ctx.getBean(SecondBeanSetter.class);
    	System.out.println(sbs.getfBean());
    }
}
