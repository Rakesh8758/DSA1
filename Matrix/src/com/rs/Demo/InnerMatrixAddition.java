package com.rs.Demo;

import java.util.Scanner;

public class InnerMatrixAddition 
{

	public static void main(String[] args) 
	{
		int sum =0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number of rows ");
		int r=sc.nextInt();
		System.out.println("Enter number of columns ");
		int c=sc.nextInt();
		
		System.out.println(" ");
		int a[][]=new int [r][c];
		for (int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=a[i][j]+sc.nextInt();
			}
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				sum=sum+a[i][j];
			}
			System.out.println(sum);
		}

	}// end of main

}// end of class
