package com.training.programs;

import java.io.ObjectInputStream.GetField;
import java.util.HashMap;
import java.util.Map;

public class GetMinusOfKeyInMap 
{
    public static void main(String[] args) 
    {
	    Map<Integer, Integer> map=new HashMap<Integer, Integer>();
	     
	    map.put(1,2);
	    map.put(3,4);
	    map.put(5,6);
	    map.put(4,2);
	    map.put(8,29);
	    map.put(3,22);
	    map.put(21,24);
	    
	    for(Map.Entry<Integer,Integer> minus:map.entrySet())
	    {
	    	System.out.println(minus.getKey()+" "+(minus.getValue()-1));
	    }
	    
	}
}
