package com.training.programs;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.management.ImmutableDescriptor;

public class NullCheck 
{
   
	public static void main(String[] args) {
		
		try
		{
			
	Scanner sc=new Scanner(System.in);
	String name="";
	
	if(!name.isEmpty())
	{
       System.out.println("12345678i7654");		
	}
		}
		catch (Exception e)
		{
			System.out.println("0000000000000");
		}
	
	String s="Hi 5";
	String[] spli=s.split("//s");
	
	Map<String, String> map=new HashMap<String, String>();
	
	map.put("One","One");
	
	Map<String,String> immutableMap=Collections.unmodifiableMap(map);
	System.out.println(immutableMap);
	 
	
	
	
}
	

}
