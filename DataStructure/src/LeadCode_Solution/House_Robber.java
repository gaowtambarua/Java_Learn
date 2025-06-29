package LeadCode_Solution;

public class House_Robber {
	public House_Robber()
	{
		int [] nums={2,1,6,2};
		System.out.println(rob(nums));
	}

	public int rob(int[] nums) {
		
		int pre=0,b=0,max=0;
		
		for(int num: nums)
		{
			b=num+b;
			max=Math.max(b,pre);
			b=pre;
			pre=max;
		}
		
		return  pre;
	}
}
