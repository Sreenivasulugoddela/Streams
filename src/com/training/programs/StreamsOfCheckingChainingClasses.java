package com.training.programs;

import java.util.List;
import java.util.stream.Stream;

public class StreamsOfCheckingChainingClasses 
{
    public static void main(String[] args)
    {
	     Stream<ABB> aa=Stream.of(new ABB("sree","23" ,new BA("Charan","22")));
	     
	     
	}
}

class ABB
{
	private String name;
	
	private String age;
	
	private BA ba;
	
	public ABB(String name,String age,BA ba)
	{
		this.name=name;
		this.age=age;
		this.ba=ba;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
	
}
class BA
{
	private String name2;
	
	private String age2;

	public BA(String name2, String age2) {
		super();
		this.name2 = name2;
		this.age2 = age2;
	}

	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

	public String getAge2() {
		return age2;
	}

	public void setAge2(String age2) {
		this.age2 = age2;
	}
	
	
}
