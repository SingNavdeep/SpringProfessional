package com.study.spring.customevent.beans;

import org.springframework.context.ApplicationListener;

public class ListenerBean implements ApplicationListener<EventBean>
{

	public void onApplicationEvent(EventBean event) 
	{
		System.out.println("Event message: " + event.getMsg());
		
	}
	
}
