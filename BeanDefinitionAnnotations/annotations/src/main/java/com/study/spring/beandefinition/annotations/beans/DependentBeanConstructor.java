package com.study.spring.beandefinition.annotations.beans;

import org.springframework.stereotype.Component;

/**
 * constructor injection
 * @author c_navdeep.singh
 *
 */
@Component
public class DependentBeanConstructor
{
	private AnnotatedBean annotatedBean;
	
	public AnnotatedBean getAnnotatedBean() {
		return annotatedBean;
	}

	public DependentBeanConstructor(AnnotatedBean aBean)
	{
		annotatedBean = aBean;
		
	}
}
