package LeadCode_Solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class LastVisitedIntegers {
	public LastVisitedIntegers()
	{
		int [] nums={1,2,-1,5,-1,-1,-1,-1};	
		System.out.println(lastVisitedIntegers(nums));
	}
	public List<Integer> lastVisitedIntegers(int[] nums) {
		LinkedList<Integer> seen=new LinkedList<Integer>();
		List<Integer> result=new LinkedList<Integer>();
		int k=0;
		for(int n : nums)
		{
			if(n!=-1)
			{
				seen.addFirst(n);
				k=0;
			}
			else
			{
				if(k<seen.size())
				{
					result.add(seen.get(k));
				}
				else
				{
					result.add(-1);
				}
				k++;
			}
		}
		
		return result;
	}
}
