package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.StudentsData;

@RestController
public class ShowingObject
{
    @GetMapping("print {type}")
	public String Student (@PathVariable String type )
	{
		StudentsData S= Factory.createObject(type);
	
		S.Name();
		S.Address();
		S.MobileNumber();
		S.Branch();
		S.cgpa();
		return S.CollegeName();

		
	}
	
}
