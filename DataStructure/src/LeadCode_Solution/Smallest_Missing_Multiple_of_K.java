package LeadCode_Solution;

import java.util.*;

public class Smallest_Missing_Multiple_of_K {
	public Smallest_Missing_Multiple_of_K()
	{
		int  nums []={8,2,3,4,6},k=2;
		System.out.println(missingMultiple(nums,k));
	}
	 public int missingMultiple(int[] nums, int k) {
	        List<Integer> list=new LinkedList<Integer>();
	        for(int val : nums)
	            {
	                list.add(val);
	            }
	        int increment=k;
	        boolean mul=list.contains(k);
	        while(mul)
	            {
	                if(!list.contains(increment))
	                {
	                	 mul=false;
	                    return increment;
	                }
	                increment=increment+k;
	            }
	        return increment;
	        
	    }
}
