package com.rs;

public class PalindromeNumber {

	public static void main(String[] args) 
	{
		int original=121,reverse=0;
		int tempOriginal=original;
		while(tempOriginal >0)
		{
			int lastDigit=tempOriginal % 10;
			reverse=reverse * 10 +lastDigit;
			tempOriginal=tempOriginal/10;
		}
		if(original == reverse)
			System.out.println("it's a palindrome no.");
		else
			System.out.println("it's not a palindrome no.");
		
	}

}
