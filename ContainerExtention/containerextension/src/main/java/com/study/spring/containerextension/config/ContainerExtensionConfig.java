package com.study.spring.containerextension.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.study.spring.containerextension.beans.FactoryPostProcessorBean;
import com.study.spring.containerextension.beans.PostProcessorBean;
import com.study.spring.containerextension.beans.SimpleBean;

@Configuration
public class ContainerExtensionConfig
{
	@Bean
	public PostProcessorBean getPostProcessorBean()
	{
		return new PostProcessorBean();
	}
	
	@Bean
	public FactoryPostProcessorBean getFactoryPostProcessorBean()
	{
		return new FactoryPostProcessorBean();
	}
	
	@Bean("simpleBean")
	public SimpleBean getSimpleBean()
	{
		return new SimpleBean();
	}
}
