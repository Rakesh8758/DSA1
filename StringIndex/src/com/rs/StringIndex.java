package com.rs;

import java.util.*;

public class StringIndex {

	public static void main(String[] args) 
	{
		String name="hello%##@122rasha";
		String temp="";
		for(int i=0;i<=name.length()-1;i++) {
			 char c=name.charAt(i);
			 if(!Character.isLetterOrDigit(c)) {
			temp+=c;
			 }
			
		}
		 System.out.println(temp);
	}

}
