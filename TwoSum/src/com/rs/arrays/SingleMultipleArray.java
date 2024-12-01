package com.rs.arrays;

import java.util.Scanner;

public class SingleMultipleArray {

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
			a[i]=a[i]*a[i];
			if(a[i]%2==0)
				product=product*a[i];
				
			
		}
		System.out.println(product);

	}

}
