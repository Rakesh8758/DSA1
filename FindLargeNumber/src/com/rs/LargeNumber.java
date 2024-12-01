package com.rs;

import java.util.Scanner;

public class LargeNumber 
{
	public static void main(String[] args)
	{
		int evensum=0;
		int oddsum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of elements");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			if(arr[i]%2!=0)
			{
		
				oddsum=oddsum+arr[i];
				
			}
			System.out.print(oddsum);
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i] + " ");
			if(arr[i]%2==0)
			{
				evensum=evensum+arr[i];
			}
			
			System.out.println(evensum);

		}
	}

}
