package com.study.spring.customevent;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.study.spring.customevent.beans.EventPublisher;
import com.study.spring.customevent.beans.ListenerBean;

@Configuration
public class CustomEventConfig
{
	@Bean("eventPublisher")
	public EventPublisher getEventPub()
	{
		return new EventPublisher();
	}
	
	@Bean("eventListener")
	public ListenerBean getEventListener()
	{
		return new ListenerBean();
	}
}
