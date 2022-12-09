package com.training.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEachPurpose
{
       public static void main(String[] args) 
       {
		   List<String> names=new ArrayList<String>();
		   
		   names.add("A");
		   names.add("B");
		   names.add("C");
		   names.add("E");
		   names.add("D");
		   names.add("F");
		   //normal for
		   for(String name:names)
		   {
			   System.out.println(name);
		   }
		   System.out.println("----------------");
		   //forEach
		   
		   names.forEach(name->System.out.println(name));
		   System.out.println("_-----");
		   List<Integer> numbers=Arrays.asList(1,2,3,4,5,8,6,7);
		   
		   numbers.forEach(number->
		   {
		       if(number==12)
		       {
		    	   System.out.println(numbers);
		       }
		       else
		    	   System.out.println(number);
		   } 
				   );
		   
	}
}
