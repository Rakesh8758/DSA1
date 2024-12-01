package com.rs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionMthods {

	public static void main(String[] args)
	{
		List<String> StudentList=new ArrayList<>();
		StudentList.add("Rakesh");
		StudentList.add("arjun");
		StudentList.add("Rakhi");
		StudentList.add("pandi");
		StudentList.add("Lucky");
		System.out.println(" students name "+StudentList);
		Collections.addAll(StudentList, "202","303","432","234","222");
		System.out.println("Students and their roll no is "+StudentList);
		StudentList.remove(3);
		System.out.println("remove 3"+StudentList);
		StudentList.size();
		System.out.println("Size is "+StudentList);
		
		System.out.println(StudentList.iterator());
		
		

	}

}
