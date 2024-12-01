package com.rs;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) 
	{
		String str="rakesh";
		//Approach -1
		char[] arr = str.toCharArray();
		Arrays.sort(arr);
		System.out.println(new String (arr));
		
		//Approach-2

		String name="Bunnu";
		char temp;
		char[] charArray = name.toCharArray();
		for(int i=0;i<charArray.length;i++)
		{
			for(int j=i+1;j<charArray.length;j++)
			{
				if(charArray[i]>charArray[j])
				{
					temp=charArray[i];
					charArray[i]=charArray[j];
					charArray[j]=temp;
				}
			}
		}
		System.out.println(new String(charArray));
	}

}
