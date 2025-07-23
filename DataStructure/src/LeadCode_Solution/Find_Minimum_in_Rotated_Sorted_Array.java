package LeadCode_Solution;

import java.util.Arrays;

public class Find_Minimum_in_Rotated_Sorted_Array {
	public Find_Minimum_in_Rotated_Sorted_Array()
	{
		int [] nums={11,1,2,3};
		System.out.println(findMin(nums));
	}
	//////////////////2//////////////
	public int findMin(int[] nums) {
		int left=0;
		int right=nums.length-1;
		if(nums[left]<=nums[right])
		{
			return nums[0];
		}
		while(left<=right)
		{
			int mid=left+(right-left)/2;
			if(nums[mid]>nums[right])
			{
				left=mid+1;
			}
			else if(nums[mid]<nums[right])
			{
				right=mid;
			}
			else
			{
				return nums[mid];
			}
		}

		return -1;
	}
	//	public int findMin(int[] nums) {
	//		int left=0;
	//		int right=nums.length-1;
	//		if(nums[left]<=nums[right])
	//		{
	//			return nums[0];
	//		}
	//		while(left<=right)
	//		{
	//			if(nums[left]<nums[left+1])
	//			{
	//				left=left+1;
	//			}
	//			else if(nums[right]>nums[right-1])
	//			{
	//				right=right-1;
	//			}
	//			else
	//			{
	//				return nums[right];
	//			}
	//		}
	//		
	//		return -1;
	//	}





}
