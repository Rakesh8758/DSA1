package com.rs;

public class Reverse {

	public static void main(String[] args) 
	{
		
		String str="hello bunnu kish";
		System.out.println("Original String ="+str);
		String[] words=str.split(" ");
		
		String output="";
		for(String word : words)
		{
			String reverse="";
			for(int i=word.length()-1;i>=0;i--)
			{
				
				reverse=reverse+
				word.charAt(i);
			}
			output=output+reverse+" ";
		}
		System.out.println(output);
	}

}
