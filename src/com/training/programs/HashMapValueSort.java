package com.training.programs;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapValueSort {
	
	
	public static void main(String[] args) 
	{
	     
		Map<String,Integer> sortedValue=new HashMap<String, Integer>();
		
		sortedValue.put("Ten", 10);
		sortedValue.put("five", 5);
		sortedValue.put("nine", 9);
		sortedValue.put("six", 6);
		sortedValue.put("four", 4);
		sortedValue.put("one", 1);
		
		//List<Entry<String, Integer>> sort=new LinkedList<Map.Entry<String,Integer>>();
		
		List<Integer> customSorted=new LinkedList<Integer>();
		
		for(Map.Entry<String, Integer> map:sortedValue.entrySet())
		{
			customSorted.add(map.getValue());
		}
		
		Collections.sort(customSorted);
		
		System.out.println(customSorted);
	}

}
