package LeadCode_Solution;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Find_Minimum_in_Rotated_Sorted_Array_II {
	public Find_Minimum_in_Rotated_Sorted_Array_II() {
        int[] nums = {6, 7, 0, 1, 2, 3, 4, 5};  // Rotated Sorted Array
        System.out.println("Maximum: " + findMax(nums));
       // System.out.println((1.4-Math.round(1.4))<1e-10);
    }

    public int findMax(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
        	int mid=left+(right-left)/2;
        	if((nums[mid]>nums[right])&&(nums[mid]>nums[left]))
        	{
        		left=mid;
        	}
        	else
        	{
        		if(nums[mid]>nums[left])
        		{
        			left=mid;
        		}
        		else if(nums[mid]<nums[right]&&nums[mid]>=nums[left])
        		{
        			left=mid+1;
        		}
        		else
        		{
        			right=mid;
        		}
        	}
        }

        return nums[left];
    }

//	public int findMin(int[] nums) {
//		List<Integer> a=new ArrayList<Integer>();
//		for(int n:  nums)
//		{
//			if(!a.contains(n))
//			{
//				a.add(n);
//			}
//		}
//		int left=0,right=a.size()-1;
//		while(left<right)
//		{
//			int mid=left+(right-left)/2;
//			if(a.get(mid)<a.get(right))
//			{
//				right=mid;
//			}
//			else
//			{
//				left=mid+1;
//			}	
//		}
//		return a.get(left);
//	}
	public int findMin(int[] nums) {
		// 2,2,2,0,1
		int left=0,right=nums.length-1;
		while(left<right)
		{
			int mid=left+(right-left)/2;
			if(nums[mid]<nums[right])
			{
				right=mid;
			}
			else if(nums[mid]>nums[right])
			{
				left=mid+1;
			}
			else
			{
				right--;
			}	
		}
		return nums[right];
	}
}
