package com.rs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearching {

	public static void main(String[] args) 
	{
		List<Integer> appNo=new ArrayList<>();
		appNo.add(101);
		appNo.add(202);
		appNo.add(302);

		appNo.add(333);

		appNo.add(213);

		
		appNo.add(532);

		appNo.add(943);
		int search=Collections.binarySearch(appNo, 333);
		System.out.println(search);
		search=Collections.binarySearch(appNo, 532);
		System.out.println(search);
		
		search=Collections.binarySearch(appNo, 432);
		System.out.println(search);

		
	}

}
