package com.study.spring.beandefinition.annotations.beans;

import org.springframework.stereotype.Component;

/**
 * field injection
 * @author c_navdeep.singh
 *
 */
@Component
public class DependentBeanField
{
	private AnnotatedBean annotatedBean;

	public AnnotatedBean getAnnotatedBean() {
		return annotatedBean;
	}
	
	
}
