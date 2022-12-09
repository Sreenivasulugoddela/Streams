package com.training.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindDuplicateStrings
{
   public static void main(String[] args) 
   {
	  
	   
	// include double quote 
	   String example = "This is the \"String\" class";
	   
	   String[] arr= {"ZYX","B","CCC","D","FF","SXS"};
  
       List<String> arr1=Arrays.asList("ZYX","B","CCC","D","FF","SXS");
       
       List<String> findDuplicates=arr1.stream().distinct().collect(Collectors.toList());
       
       System.out.println(arr[0]);
       
        System.out.println(findDuplicates);
       for(int i=0;i<arr.length;i++)
       {
    	    
       }
   
   }
}
