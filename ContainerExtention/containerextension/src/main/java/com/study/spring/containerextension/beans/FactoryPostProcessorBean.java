package com.study.spring.containerextension.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.Ordered;

public class FactoryPostProcessorBean implements BeanFactoryPostProcessor, Ordered
{

	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException
	{
		System.out.println("Bean factory post processor called");
		System.out.println("Contains bean simpleBean?" + beanFactory.containsBean("simpleBean"));
		
	}

	public int getOrder() {
		// TODO Auto-generated method stub
		return -1;
	}
	
}
