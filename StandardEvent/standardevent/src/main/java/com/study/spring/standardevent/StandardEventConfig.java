package com.study.spring.standardevent;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.study.spring.standardevent.beans.StandardEventsAwareBean;

@Configuration
public class StandardEventConfig
{
	@Bean("standardEventBean")
	public StandardEventsAwareBean getBean()
	{
		return new StandardEventsAwareBean();
	}
}
