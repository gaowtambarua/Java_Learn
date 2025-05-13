package LeadCode_Solution;

import java.util.Arrays;

public class Squares_of_a_Sorted_Array {
	public Squares_of_a_Sorted_Array()
	{
		///////    0 1 10  12 14 45
		int [] nums ={-4,-1,0,3,10};
		System.out.println(Arrays.toString(sortedSquares(nums)));
	}
	//	public int[] sortedSquares(int[] nums) {
	//		int [] result=new int[nums.length];
	//
	//		for(int i=0;i<nums.length;i++)
	//		{
	//			result[i]=nums[i]*nums[i];
	//		}
	//		Arrays.sort(result);
	//		return result;
	//		
	//	}

	public int[] sortedSquares(int[] nums) {
		int left=0;
		int right=nums.length-1;
		int [] result=new int [nums.length];
		int pos = nums.length - 1;
		while(left<=right)
		{
			if(nums[left]*nums[left]<nums[right]*nums[right])
			{
				result[pos]=nums[right]*nums[right];
				right--;
			}
			else
			{
				result[pos]=nums[left]*nums[left];
				left++;
			}
			pos--;
		}
		
		return result;
	}
}
