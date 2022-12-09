package com.training.programs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class NestedList {
       
	
	public static void main(String[] args)
	{
		try
		{
	     List<ListOne> one=new LinkedList<ListOne>();
	     
	     List<ListTwo> two=new ArrayList<ListTwo>();
	     //ListTwo twos= new ListTwo(2, new ListOne(2,3,4));
	    // two.add(new ListTwo(22,new ListOne(23, 3,4)));
	    
	     for(ListTwo twos:two)
	     {
	    		 System.out.println(twos);   	 
	     }
	}
		catch (Exception e) {
			e.printStackTrace();
		}
}
class ListOne
{
	private int one;
	
	private int two;
	
	private int three;
	
	

	public ListOne(int one, int two, int three) {
		super();
		this.one = one;
		this.two = two;
		this.three = three;
	}

	public int getOne() {
		return one;
	}

	public void setOne(int one) {
		this.one = one;
	}

	public int getTwo() {
		return two;
	}

	public void setTwo(int two) {
		this.two = two;
	}

	public int getThree() {
		return three;
	}

	public void setThree(int three) {
		this.three = three;
	}

	@Override
	public String toString() {
		return "ListOne [one=" + one + ", two=" + two + ", three=" + three + "]";
	}
	
}

class ListTwo
{
	private int mainOne;
	
    private ListOne one;
	
	
	public ListTwo(int i, ListOne listOne) {
      this.mainOne=i;
      this.one=listOne;
	}


	public int getMainOne() {
		return mainOne;
	}


	public void setMainOne(int mainOne) {
		this.mainOne = mainOne;
	}


	public ListOne getOne() {
		return one;
	}


	public void setOne(ListOne one) {
		this.one = one;
	}


	@Override
	public String toString() {
		return "ListTwo [mainOne=" + mainOne + ", one=" + one + "]";
	}
}
}

	
	
