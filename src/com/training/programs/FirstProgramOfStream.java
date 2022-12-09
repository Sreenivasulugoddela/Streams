package com.training.programs;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstProgramOfStream 
{
    public static void main(String[] args) 
    {
		 
        List<Integer> numToArray=Arrays.asList(1,2,3,4,5);
    	
        int countOfArray=(int) numToArray.stream().count();
        System.out.println("Count of an array:-"+countOfArray);
        System.out.println("--------------------");
    	numToArray.parallelStream().forEach(System.out::println);
    	System.out.println("------------------");
    	Stream.iterate(0, n->n+1)
    	.limit(10)
    	.forEach(x->System.out.println(x));
    	
    	System.out.println("--------------------");
    	
    	
    	Stream.iterate(0,n->n+1)
    	.filter(x->x%2==0)
    	.limit(20)
    	.forEach(x->System.out.println(x));
    	
    	
    	System.out.println("--------------------------------");
    	
    	
    	
    	List<Integer> num=new ArrayList<Integer>();
    	num.add(1);
    	num.add(4);
    	num.add(3);
    	num.add(6);
    	num.add(3);
    	num.add(4);
     
    	
    	
    	List<Integer> result=num.stream().filter(p->p%2==0).collect(Collectors.toList());
    	
    	for(int i:result)
    	{
    		System.out.println(i);
    	}
   	
	}
}

