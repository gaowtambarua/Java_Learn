package LeadCode_Solution;

import java.util.HashSet;

public class Remove_Duplicates_from_Sorted_Array {
	public Remove_Duplicates_from_Sorted_Array()
	{
		int[] nums = {0,1,1,1,2,2,3,4};
		System.out.println(checkIfExistC(nums));
	}
	private int  checkIfExistC(int [] nums)
	{
		int k=1;
		for(int i=1;i<nums.length;i++)
		{
			if(nums[k-1]!=nums[i])
			{
				nums[k]=nums[i];
				k++;
			}
		}
		return k;
	}
}
