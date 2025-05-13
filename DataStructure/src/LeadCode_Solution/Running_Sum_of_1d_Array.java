package LeadCode_Solution;

public class Running_Sum_of_1d_Array {
	int [] nums={3,1,2,10,1};
	public Running_Sum_of_1d_Array()
	{
		runningSum(nums); 
		for(int i=0;i<nums.length;i++)
		{
			System.out.print(" "+nums[i]);
		}
	}

	public int[] runningSum(int[] nums) {
		for(int i=1;i<nums.length;i++)
		{
			nums[i]=nums[i]+nums[i-1];
		}
		return nums;
	}


}