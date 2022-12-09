package com.training.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.*;
public class SecondOfStreams 
{
	
	// this class represents getDetails of particular variables 
   public static void main(String[] args) 
   {
	    
	   List<BAC> empDetails=new ArrayList<BAC>();
	   
	   empDetails.add(new BAC("Sreenivasulu.Goddela","1912","12,000","sreenivasulu.g@techouts.com"));
	   empDetails.add(new BAC("CharanKumar.Rupishetty","1910","15,000","charan.@techouts.com"));
	   empDetails.add(new BAC("Bhasker.Macharala","1909","15,000","bhasker.m@techouts.com"));
	   empDetails.add(new BAC("Adarsh.Kahre","1902","15,000","adarsh.k@techouts.com"));
	   empDetails.add(new BAC("Shubam.Kale","1908","12,000","shubam.k@techouts.com"));

	   //List<BAC> result=empDetails.parallelStream().iterator();
	   
	   System.out.println(getDetails(empDetails));
   
   }
   public static Map<String,String> getDetails(List<BAC> bac)
   {
	   return bac.stream().collect(Collectors.toMap(BAC::getEmpName, BAC::getEmpSal));
   }
}
class BAC
{
	
	private String empName;
	
	private String empId;
	
	private String empSal;
	
	private String empEmail;
	
	public BAC(String empName,String empId,String empSal,String empEmail)
	{
		this.empName=empName;
		this.empId=empId;
		this.empSal=empSal;
		this.empEmail=empEmail;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpSal()
	{
		return empSal;
	}

	public void setEmpSal(String empSal)
	{
		this.empSal = empSal;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail)
	{
		this.empEmail = empEmail;
	}

	@Override
	public String toString() 
	{
		return "BAC [empName=" + empName + ", empId=" + empId + ", empSal=" + empSal + ", empEmail=" + empEmail + "]";
	}
   
	
}