package com.training.programs;

public class Multiinterfaces  implements A, B{
	
	public static void main(String[] args) {
		Multiinterfaces multi=new Multiinterfaces();
	     multi.a();
	}
   public void a()
   {
	   System.out.println("---------------");
   }
}
interface A 
{ 
  void a();
}
interface B
{
	void a();
}
