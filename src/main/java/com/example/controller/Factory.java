package com.example.controller;

import com.example.service.ClassA;
import com.example.service.ClassB;
import com.example.service.ClassC;
import com.example.service.StudentsData;

public class Factory 
{
	public static StudentsData createObject(String type)
	{
		if(type.equals("sanika")) 
		{
			ClassA C1= new ClassA();
			return C1;
		}
		
		if(type.equals("komal"))
		{
			ClassB C2= new ClassB();
			return C2;
			
		}
		if(type.equals("janvi")) 
		{
			ClassC C3=  new  ClassC();
			return C3;
		
		}
		
		return null;
	}

}
