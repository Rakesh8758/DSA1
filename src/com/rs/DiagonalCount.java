package com.rs;

import java.util.Scanner;

public class DiagonalCount {

	public static void main(String[] args) 
	{
		int suml=0 ,sumr=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter number of matrix ");
		int n=sc.nextInt();
		int ar[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				ar[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==j)
					suml=suml+ar[i][j];
					System.out.println(suml);
				if(i+j==n-1)
					sumr=sumr+ar[i][j];
				System.out.println(sumr);
				
					
						
			}
		}
		
		


	}

}
