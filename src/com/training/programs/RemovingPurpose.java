package com.training.programs;

import java.util.ArrayList;

public class RemovingPurpose
{
     
	
	public static void main(String[] args)
	{
	     ArrayList<String> str=new ArrayList<String>();
	     
	     str.add("SPring");
	     str.add("SPring learn");
	     str.add(" hi SPring");
	     str.add(" IOC SPring");
	     str.add("learn framework");
	     str.add("learn java");
	     
	     for(String strs:str )
	     {
	    	 if(strs.contains("spring"))
	    	 {
	    		 str.remove(str);
	    		 str.remove(5);
	    	 }
	     }
	     
	     for(String strs:str)
	     {
	    	 System.out.println(strs);
	     }
	}
}
