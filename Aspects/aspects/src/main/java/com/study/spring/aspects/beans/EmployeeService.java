package com.study.spring.aspects.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeService {
	
	@Autowired
	private Employee employee;
	private String name = "DefaultName";
	
	public Employee getEmployee()
	{
		System.out.println("EmployeeService getEmployee() called.");
		//setting name twice to demonstrate around advice
		employee.setName(name);
		employee.setName("NotDefaultName");
		return this.employee;
	}
}
