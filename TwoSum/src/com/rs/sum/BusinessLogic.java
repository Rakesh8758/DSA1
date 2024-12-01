package com.rs.sum;

import java.util.HashMap;
import java.util.Map;

public class BusinessLogic 
{
	public int[] twoSum(int[] nums,int target)
	{
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<nums.length;i++)
		{
			int complements=target-nums[i];
			if(map.containsKey(complements))
			{
				int[] arr= {map.get(complements), i};
				return arr;
			}
			map.put(nums[i], i);
		}
		return null;
	}

}
