package com.study.spring.container.beans;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Setter based injection
 * @author c_navdeep.singh
 *
 */
public class SecondBeanSetter {

	FirstBean fBean;

	public FirstBean getfBean() {
		return fBean;
	}

	@Autowired
	public void setfBean(FirstBean fBean) {
		this.fBean = fBean;
	}
}
