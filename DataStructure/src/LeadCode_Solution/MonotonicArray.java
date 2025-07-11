package LeadCode_Solution;

public class MonotonicArray {
	public MonotonicArray()
	{
//		int [] nums = {1,2,4,3};
		int [] nums = {1,2,5,2};
		System.out.println(isMonotonic(nums));
	}
	public boolean isMonotonic(int[] nums) {
		
//		boolean increasing=true;
//		boolean decreasing=true;
//		
//		for(int i=0;i<nums.length-1;i++)
//		{
//			if(nums[i]<nums[i+1])
//			{
//				decreasing=false;
//			}
//			else if(nums[i]>nums[i+1])
//			{
//				increasing=false;
//			}
//			
//		}
//		
//		return increasing||decreasing;
		
		
		
		
		//////////////////////////////////////////// Second Soluion
		
		int i=0;
		boolean t=true;
		while(i<nums.length-1&&nums[i]==nums[i+1])
		{
				i++;
		}
		if(i<nums.length-1&&nums[i]<nums[i+1])
		{
			for(i=i;i<nums.length-1;i++)
			{
				if(nums[i]>nums[i+1])
				{
					t=false;
					return  t;
				}
			}
		}
		else if(i<nums.length-1&&nums[i]>nums[i+1])
		{
			for(i=i;i<nums.length-1;i++)
			{
				if(nums[i]<nums[i+1])
				{
					t=false;
					return  t;
				}
			}
		}
		return  t;
		
	}
}
