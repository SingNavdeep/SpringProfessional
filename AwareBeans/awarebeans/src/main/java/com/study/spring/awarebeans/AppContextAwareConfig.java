package com.study.spring.awarebeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.study.spring.awarebeans.beans.AppContextAwareBean;
import com.study.spring.awarebeans.beans.NameAwareBean;

@Configuration
public class AppContextAwareConfig
{
	@Bean("appContextAware")
	public AppContextAwareBean getAppContextAwareBean()
	{
		return new AppContextAwareBean();
	}
	@Bean("nameAware")
	public NameAwareBean getNameAwareBean()
	{
		return new NameAwareBean();
	}
}
