package com.rs;

import java.util.Scanner;

public class SumOfTwoDigits
{
	public static void main(String[] args)
	{
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter digits ");
		int n=sc.nextInt();
		while(n!=0)
		{
			sum=sum+n%10;
			n=n/10;
		}
		System.out.println(sum);
	}

}
