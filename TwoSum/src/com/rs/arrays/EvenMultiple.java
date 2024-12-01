package com.rs.arrays;

import java.util.Scanner;

public class EvenMultiple 
{
	public static void main(String[] args)
	{
		int product=1;
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		System.out.println("Enter"+n + "numbers ");
		int a[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]%2==0)
				
			
				System.out.println(a[i]);
			
				
		}
		
		
	}

}
