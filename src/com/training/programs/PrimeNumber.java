package com.training.programs;

import java.util.Scanner;

public class PrimeNumber 
{
   public static void main(String[] args) 
   {
	  Scanner sc=new Scanner(System.in);
	  
	  System.out.println("Enter any number");
	  int n=sc.nextInt();
	  boolean isPrime=false;
	 
	  for(int i=0;i<=2;i++)
	  {
		  if(n%2!=0)
		  {
			  isPrime=true;
			  break;
		  }
	  }
	  if(isPrime)
	  {
		  System.out.println(n+":- is prime number");
	  }
	  else
		  System.out.println(n+" is not primenumber");
	  
   }
}
