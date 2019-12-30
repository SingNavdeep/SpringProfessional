package com.study.spring.aspects;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.study.spring.aspects.beans.Employee;
import com.study.spring.aspects.beans.EmployeeService;

@Configuration
@EnableAspectJAutoProxy
public class AspectsConfig
{
	@Bean("employee")
	public Employee getEmployee()
	{
		//System.out.println("Config get employee called");
		return new Employee();
	}
	
	@Bean(name="employeeService")
	public EmployeeService getEmployeeService()
	{
		//System.out.println("Config get emp service called");
		return new EmployeeService();
	}
}