package com.study.spring.customevent.beans;

import org.springframework.context.ApplicationEvent;

/**
 * a normal POJO class.
 * NOTE: not managed by the container.
 * This class will be instantiated by publisher class
 * @author c_navdeep.singh
 *
 */
public class EventBean extends ApplicationEvent
{
	private String msg;

	public EventBean(Object source, String msg)
	{
		super(source);
		this.msg = msg;
	}
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
