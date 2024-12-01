package com.rs;

public class CountLength 
{
	public static void main(String[] args)
	{
		String str="  my name is rakesh  ";
		System.out.println(Length(str));
		
	}
	public static int Length(String s)
	{
		String str=s.trim();
		int count=0;
		for(int i=str.length()-1;i>=0;i--)
		{
			if(str.charAt(i)!=' ')
			{
			count++;
			}
			else
			{
				break;
			}
		}
		return count;
	}

}
