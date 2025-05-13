package LeadCode_Solution;

public class Move_Zeroes {
	public Move_Zeroes()
	{
		int[] nums={1,0,1,0,3,12};
		moveZeroes(nums);
	}
	public void moveZeroes(int[] nums) {
		int k=0;
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]!=0)
			{
				int temp=nums[k];
				nums[k]=nums[i];
				nums[i]=temp;
				k++;
			}
		}
	}
}
