package com.study.spring.beandefinition.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import com.study.spring.beandefinition.annotations.beans.AnnotatedBean;
import com.study.spring.beandefinition.annotations.beans.DependentBean;
import com.study.spring.beandefinition.annotations.beans.DependentBeanConstructor;
import com.study.spring.beandefinition.annotations.beans.DependentBeanField;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx = new AnnotationConfigApplicationContext("com.study.spring.beandefinition.annotations.beans");
    	ctx.getBean(AnnotatedBean.class);
    	ctx.getBean(DependentBean.class);
    	ctx.getBean(DependentBeanField.class);
    	ctx.getBean(DependentBeanConstructor.class);
    }
}
