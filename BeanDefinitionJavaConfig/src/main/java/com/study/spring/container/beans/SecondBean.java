package com.study.spring.container.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class SecondBean
{
	private FirstBean fBean;
	
	public FirstBean getfBean() {
		return fBean;
	}

	public SecondBean()
	{
		
	}
	
	@Autowired
	public SecondBean(FirstBean fBean)
	{
		this.fBean = fBean;
	}
}
