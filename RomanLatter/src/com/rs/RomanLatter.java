package com.rs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanLatter {

	public static void main(String[] args)
	{
		Map<Character, Integer> map=new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		Scanner sc=new Scanner(System.in);
		
		String s=sc.nextLine();
		
		int number=0;
		
		for(int i=0;i<s.length();i++)
		{
			number=number+(map.get(s.charAt(i)));
		}
		System.out.println("corresponding nummber"+number);

	}

}
