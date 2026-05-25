package com.nt.test;

import java.lang.reflect.Constructor;

public class GenericeTest_Solution
{
	public static <T> T getInstance(Class<T> clazz) throws Exception
	{
	  Constructor cons[] = clazz.getDeclaredConstructors();
	  
	  return (T) cons[0].newInstance();
	}
	  
public static void main(String[] args) 
{
	try {
	Employee emp = getInstance(Employee.class);
	System.out.println(emp);
	
	System.out.println("--------------------------------");

	Customer cust = getInstance(Customer.class);
	System.out.println(cust);
	System.out.println("--------------------------------");
	
	
//	Student s1=getInstance(Student.class);
//	System.out.println(s1);
	
	
	}
	catch (Exception e) {
		e.printStackTrace();
	}
}
}










