package com.study.spring.aspects;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.study.spring.aspects.beans.Employee;
import com.study.spring.aspects.beans.EmployeeService;
import com.study.spring.aspects.exception.DummyException;

/**
 * Spring AOP with aspects
 * @author c_navdeep.singh
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx = new AnnotationConfigApplicationContext("com.study.spring.aspects");
    	EmployeeService empSer = ctx.getBean(EmployeeService.class);
    	Employee aEmp = empSer.getEmployee();
    	System.out.println("Employee Name:" + aEmp.getName());
    	System.out.println("Employee dummy obj: " + aEmp.getDummy());
    	try {
			aEmp.throwDummyException();
			aEmp.throwException();
		} catch (DummyException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
    }
}
