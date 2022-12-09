package com.training.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomPurposeMain 
{
    public static void main(String[] args) {
		System.out.println(collect());
	}
	
	public static List<CustomPurpose> collect()
	{
		CustomPurpose customPurpose=new CustomPurpose();
		List<CustomPurpose> details=new ArrayList<CustomPurpose>();
		
		customPurpose.setName("sree");
		customPurpose.setAge("23");
		customPurpose.setEmail("12345676543");
		customPurpose.getName();
		customPurpose.getAge();
		customPurpose.getEmail();
		details.add(customPurpose);
		return details;
	}
}
