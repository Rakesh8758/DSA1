package com.rs;

public class Replace {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String str="sunset";
		char replaceChar='a';
		int count=1;
		if(str.indexOf(replaceChar)==-1)
		{
			System.out.println("char not present in the string");
			System.exit(0);
		}
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch==replaceChar)
			{
				str=str.replaceFirst(String.valueOf(replaceChar), String.valueOf(count));
				count++;
			}
		}
		System.out.println(str);

	}

}
