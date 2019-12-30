package com.study.spring.aspects.beans;

import com.study.spring.aspects.exception.DummyException;

public class Employee
{
	private String name;
	
	
	public String getName() {
		System.out.println("employee get name called");
		return name;
	}
	
	public DummyObject getDummy()
	{
		return new DummyObject();
	}

	//@Loggable
	public void setName(String nm) {
		this.name=nm;
	}
	
	//throw an exception to test After and AfterThrowing advice
	public void throwException()
	{
		throw new RuntimeException("Dummy RUNTIME Exception");
	}	
	
	public void throwDummyException() throws DummyException
	{
		throw new DummyException("Dummy Exception");
	}
	
	public class DummyObject
	{
		
	}

}
