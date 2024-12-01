package com.rs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ListMethods {

	public static void main(String[] args) 
	{
		List<Integer> num=new ArrayList<>();
		Random random=new Random();
		for(int i=0;i<10;i++)
			num.add(random.nextInt(1000));
		System.out.println(num);
		//Natural sorting
		Collections.sort(num);
		
		//num.sort((1,2)) -> {return (2-1);});

	

	}

}
