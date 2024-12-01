package com.rs;

import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		int maxSal1=0, maxSal2=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers of element");
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			if(maxSal1<arr[i])
			{
				maxSal2=maxSal1;
				maxSal1=arr[i];
				
			}
			if(maxSal2<arr[i] && arr[i]<maxSal1)
			{
				maxSal2=arr[i];
			}
		}
		

	}

}
