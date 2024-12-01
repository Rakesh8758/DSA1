package com.rs;

import java.util.HashMap;
import java.util.Map;

public class mmm {
	public static void main(String[] args) {
		
	
	String s="hello";
	for(int i=0;i<=s.length()-1;i++) {
		char c=s.charAt(i);
		String s1=s.replace(c+"", "");
		int count=s.length()-s1.length();

		System.out.println(c+ ""+count);
		//break;
	}
	
	
	}
}