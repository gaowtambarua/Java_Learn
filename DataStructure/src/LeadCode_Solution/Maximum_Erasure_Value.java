package LeadCode_Solution;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;

public class Maximum_Erasure_Value {
	public Maximum_Erasure_Value()
	{
		int [] nums = {5,2,1,2,5,2,1,2,5};
		System.out.println(maximumUniqueSubarray(nums));
	}
	public int maximumUniqueSubarray(int[] nums) {
		int left=0,length=nums.length,sum=0,result=0,k=0;;
		Hashtable<Integer, Integer> count=new Hashtable<Integer, Integer>();
		for(int right=0;right<length;right++)
		{
			sum=sum+nums[right];
			count.put(nums[right],count.getOrDefault(nums[right],0)+1);
			while(count.get(nums[right])>1)
			{
				sum=sum-nums[left];
				count.put(nums[left], count.get(nums[left])-1);
				left++;
				k=1;
			}
			result=Math.max(result, sum);
		}	
		return result;
	}
}
