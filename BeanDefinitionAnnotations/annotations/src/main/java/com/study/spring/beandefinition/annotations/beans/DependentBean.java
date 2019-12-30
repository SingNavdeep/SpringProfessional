package com.study.spring.beandefinition.annotations.beans;

import org.springframework.stereotype.Component;

@Component
public class DependentBean
{
	private AnnotatedBean annotatedBean;

	public AnnotatedBean getAnnotatedBean() {
		return annotatedBean;
	}

	public void setAnnotatedBean(AnnotatedBean annotatedBean) {
		this.annotatedBean = annotatedBean;
	}
}
