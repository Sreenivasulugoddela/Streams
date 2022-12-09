package com.training.programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListToMap 
{
  	public static void main(String[] args) 
  	{
	   List<ListToMapPurpose> list=new ArrayList<ListToMapPurpose>();
	  
	   Map<Integer, Integer> map=new HashMap<Integer, Integer>();
	  map.put(12,45);
	  map.put(45,89);
	   
	   long value=map.values().stream().mapToLong(Number::longValue).sum();
	   
	   System.out.println(value);
	   
	   Map<String,Integer> merge=new HashMap<String, Integer>();
	   
	   for(ListToMapPurpose lists:list)
	   {
		   merge.put(lists.getProductName(),lists.getRequestedQuantity());
		   
	   }
	   long values=merge.values().stream().mapToLong(Number::longValue).sum();
	    
	   for(ListToMapPurpose lists:list)
	   {
		  System.out.println(lists);
	   }
  	
  	}

}
class ListToMapPurpose
{
	private String productName;
	
	private int requestedQuantity;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getRequestedQuantity() {
		return requestedQuantity;
	}

	public void setRequestedQuantity(int requestedQuantity) {
		this.requestedQuantity = requestedQuantity;
	}

	@Override
	public String toString() {
		return "ListToMapPurpose [productName=" + productName + ", requestedQuantity=" + requestedQuantity + "]";
	}
	
	
}

