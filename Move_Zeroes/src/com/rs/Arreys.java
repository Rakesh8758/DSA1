package com.rs;

import java.util.Scanner;

public class Arreys 
{
	public static void main(String[] args)
	{
		int n,nz=0,z=0,temp,size=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("Enter no of elements");
		int nums[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			 nums[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(nums[i]);
			if()
			while(nz<nums.length)
			{
			if(nums[nz] !=0)
			{
				temp=nums[nz];
				nums[nz]=nums[z];
				nums[z]=temp;
				nz++;
				z++;
			}
			else
			{
				nz++;
			}
			}
		}
		
	}

}
