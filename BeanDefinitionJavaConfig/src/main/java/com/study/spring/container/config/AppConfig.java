package com.study.spring.container.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.study.spring.container.beans.FirstBean;
import com.study.spring.container.beans.SecondBean;
import com.study.spring.container.beans.SecondBeanSetter;

@Configuration
public class AppConfig
{
	@Bean
	public FirstBean firstBean()
	{
		return new FirstBean();
	}
	
	/**
	 * NOTE 2 ways of resolving dependencies
	 * The first one works only if beans defined in configuration classes
	 * The second one works if stereotypes have bean definition. 
	 * Second one works in both cases.
	 */
	/*@Bean
	public SecondBean secondBean()
	{
		return new SecondBean(firstBean());
	}*/
	
	@Bean
	public SecondBean secondBean(FirstBean fBean)
	{
		return new SecondBean(fBean);
		//return new SecondBean();
	}
	
	@Bean
	public SecondBeanSetter secondBeanSetter(FirstBean fBean)
	{
		/**
		 * if setter method in second bean setter is annotated with autowired,
		 * first one will work.
		 * If not, then we have to explicitly call setter on instance of second bean
		 */
		SecondBeanSetter sbs = new SecondBeanSetter();
		//sbs.setfBean(fBean);
		
		return sbs;
	}
}
