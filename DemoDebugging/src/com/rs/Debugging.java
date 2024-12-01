package com.rs;

public class Debugging 
{
	public void Addition(int a,int b)
	{
		System.out.println("Addition starts ");
		int c=a+b;
		System.out.println("Addition of both the number is "+c);
	}
	public void SubStraction(int a,int b)
	{
		System.out.println("Substraction end ");
		int c=a+b;
		System.out.println("substraction "+c);
	}

	public static void main(String[] args)
	{
		Debugging obj=new Debugging();
		obj.Addition(20, 30);
		obj.SubStraction(40, 20);
		System.out.println(obj);
	}

}

