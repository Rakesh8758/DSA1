package com.rs;

public class RemoveSpace {

	public static void main(String[] args) 
	{
		
		String name=" I am   ra  kes  h";
		String replaceAll = name.replaceAll("\\s", "");
		System.out.println(replaceAll);

	}

}
