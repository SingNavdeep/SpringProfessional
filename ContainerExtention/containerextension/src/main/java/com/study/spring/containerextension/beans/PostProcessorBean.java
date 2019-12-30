package com.study.spring.containerextension.beans;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class PostProcessorBean implements BeanPostProcessor, Ordered
{
	public Object postProcessBeforeInitialization(Object bean, String beanName)
	{ 
		System.out.println("bean " + beanName + " postProcessBeforeInitialization called");
        return bean;
	}
	public Object postProcessAfterInitialization(Object bean, String beanName) {
        System.out.println("Bean '" + beanName + "' postProcessAfterInitialization called.");
        return bean;
    }
	
	/**
	 * return the execution order of this bean post processor
	 * in case multiple bean processors are registered
	 * lower values signify high priority  
	 * @return
	 */
	public int getOrder()
	{
		
		return 0;
	}
}