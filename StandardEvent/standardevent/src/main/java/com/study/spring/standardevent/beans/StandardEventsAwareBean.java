package com.study.spring.standardevent.beans;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * Events aware bean.
 * NOTE: To receive multiple events, the ApplicationListener should be parameterized with ApplicationEvent
 * To receive a specific event, the listener should be parameterized with that event, eg. ContextClosedEvent
 * @author c_navdeep.singh
 *
 */
public class StandardEventsAwareBean implements ApplicationListener<ApplicationEvent>//, ApplicationListener<ContextClosedEvent>
{

	public void onApplicationEvent(ApplicationEvent event)
	{
		System.out.println("ContextStoppedEvent received: " + event.getClass().toString());
		
	}
}