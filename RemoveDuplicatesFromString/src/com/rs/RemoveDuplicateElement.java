package com.rs;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateElement {

	public static void main(String[] args) 
	{
		String str="programming";
		// approach -1
		StringBuilder sb1=new StringBuilder();
		str.chars().distinct().forEach(c->sb1.append((char)c));
		System.out.println(sb1);
		
		//approach -2
		
		StringBuilder sb2=new StringBuilder();
		for(int i=0; i<str.length();i++)
		{
			char ch = str.charAt(i);
			int indexOf = str.indexOf(ch);
			if(indexOf==-1)
				System.out.println(ch);
		}
		System.out.println(sb1);
		
		//approach -3
		
		char[] arr = str.toCharArray();
		StringBuilder sb3=new StringBuilder();
		for(int i=0;i<arr.length;i++)
		{
			boolean repeted=false;
			for(int j=i+1;i<arr.length;i++)
			{
				if(arr[i]==arr[j])
				{
					repeted=true;
					break;
				}
			}
			if(!repeted)
			{
				sb3.append(arr[i]);
			}
			
		}
		System.out.println(sb3);
		
		//approach-4th
		String name="rakesh rajesh";
		StringBuilder sb=new StringBuilder();
		Set<Character> set=new LinkedHashSet<>();
		for(int i=0;i<name.length();i++)
		{
			
			set.add(name.charAt(i));
		}
		for(Character c : set)
		{
			sb.append(c);
		}
		System.out.print(sb);

	}

}
