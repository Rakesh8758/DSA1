package com.rs;

public class RemoveChar
{
	public static void main(String[] args)
	{
		
		String str="I)&am@ Rak%es&*h";
		//approach 1
		String replaceAll = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(replaceAll);
		
		//2nd approach
		
		String replaceallchar = str.replaceAll("[a-zA-Z0-9]", "");
		System.out.println(replaceallchar);
		
		String name="Rakesh Samal";
		String replacecapitalLatter = name.replaceAll("[A-Z]", "");
		System.out.println(replacecapitalLatter);
				
	}

}
