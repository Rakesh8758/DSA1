package com.rs;

import java.util.Scanner;

public class CommonString 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No of words ");
		int noOfWord = Integer.parseInt(sc.nextLine());
		
		String[] str=new String[noOfWord];
		int n=str.length;
		
		
		for(int i=0;i<str.length;i++)
		{
			str[i] = sc.nextLine();
			
		}
		String result=str[0];
		for(int i=0;i<n;i++)
		{
			
			while(str[i].indexOf(result) !=0)
			{
				result=result.substring(0,result.length()-1);
				
				if(result.isEmpty())
					{
					System.out.println("not matched");
					}
			}
		}
		System.out.println("Matched String is "+result);
		

	}

}
