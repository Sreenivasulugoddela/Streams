package com.training.programs;

import java.util.UUID;

public class SmallTest 
{
    
	public static void main(String[] args) 
	{
	    int n=123456;
	    
	    int count=0;
	    
	    while(n>0)
	    {
	        n/=10;
	        count++;
	    }
	    System.out.println(count);
	    
	    String test="2";
	    String test2="";
	   String randomId=UUID.randomUUID().toString();
	   
	   if(Integer.valueOf(test)>0)
	   {
		   System.out.println("ertyhujkjhgf");
		   System.out.println(randomId);

	   }
	} 
}
