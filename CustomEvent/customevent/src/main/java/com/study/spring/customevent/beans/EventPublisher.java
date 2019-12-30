package com.study.spring.customevent.beans;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;


public class EventPublisher implements ApplicationEventPublisherAware
{
	private ApplicationEventPublisher eventPublisher;

	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher)
	{
		this.eventPublisher = applicationEventPublisher;
	}

	public void publishEvent(String msg)
	{
		EventBean eBean = new EventBean(this, msg);
		eventPublisher.publishEvent(eBean);
	}
	
}
