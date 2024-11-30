package LeadCode_Solution;

import java.util.Arrays;

public class two_Sum {

	public  two_Sum() {
		int[] nums={2,7,11,15};
		int target=17;
		nums=twoSum( nums, target);
		System.out.println(Arrays.toString(nums));
	}

	public int[] twoSum(int[] nums, int target) {

		int i=0,j=0;

		int m=0;
		for(i=0;i<nums.length;i++)
		{
			for(j=i+1;j<nums.length;j++)
			{
				if(nums[i]+nums[j]==target)
				{
					m=1;
					break;
				}
			}
			if(m==1)
			{
				break;
			}
		}
		return new int[] {i,j};
	}
}
