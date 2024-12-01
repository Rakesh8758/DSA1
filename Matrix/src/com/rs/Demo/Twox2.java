package com.rs.Demo;

import java.util.Scanner;

public class Twox2
{

	public static void main(String[] args)
	
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows ");
		int N=sc.nextInt();
		System.out.println("Enter Nummber of columns ");
		int M=sc.nextInt();
		System.out.println(" ");
		int a[][]=new int[N][M];
		
		
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<M;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println(" ");
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<M;j++)
			{
				a[i][j]=a[i][j]+sc.nextInt();
			}
			
		}
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<M;j++)
			{
				System.out.println(a[i][j]+" ");
			}
			System.out.println(" ");
		}
		
		
		



	}

}
