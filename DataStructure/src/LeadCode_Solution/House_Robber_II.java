package LeadCode_Solution;

public class House_Robber_II {

	public House_Robber_II()
	{
		int [] nums={1,2,3,4,5};

		System.out.println(rob(nums));
	}
	public int rob(int[] nums) {

		int pre=0,b=0,max=0,index=1;
		int pre2=0,b2=0,max2=0;
		if(nums.length==1)
		{
			return nums[0];
		}
		for(int num: nums)
		{
			if(index<nums.length)
			{
				b=num+b;
				max=Math.max(b,pre);
				b=pre;
				pre=max;
			}
			if(index>1)
			{
				b2=num+b2;
				max2=Math.max(b2,pre2);
				b2=pre2;
				pre2=max2;
			}
			index++;
		}
		return  Math.max(pre,pre2);
	}

}
