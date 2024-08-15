package com.rs;

import java.util.Scanner;

public class Elements {

	public static void main(String[] args)
	{
		 int num=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter no of array ");
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		

	}

}
