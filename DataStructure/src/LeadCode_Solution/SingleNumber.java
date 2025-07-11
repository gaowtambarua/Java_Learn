package LeadCode_Solution;

import java.util.Arrays;
import java.util.HashSet;

public class SingleNumber {
	public SingleNumber()
	{
		int [] nums={-1,-2,-2};
		System.out.println(singleNumber(nums));
	}
	public int singleNumber(int[] nums) {
		//		int m=0;
		//		for(int n:nums)
		//		{
		//			m=m^n;
		//		}
		//		return m;

		HashSet<Integer> seen=new HashSet<Integer>();
		for(int n:nums)
		{
			if(!seen.add(n))
			{
				seen.remove(n);
			}
			else
			{
				seen.add(n);
			}
		}
		return seen.iterator().next();
	}
}
