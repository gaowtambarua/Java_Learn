package Algoritham;

import java.util.Arrays;

public class Next_Permutation {
	
	public Next_Permutation()
	{
		int nums []={1,4,3,1};
//		int nums []={4,3,2};
		nextPermutation(nums);
		System.out.println(Arrays.toString(nums));
	}
	public void nextPermutation(int[] nums) {
		int i=nums.length-1;
		while(i-1>=0&&nums[i]<=nums[i-1])
		{
			i--;
		}
		if(i-1>=0)
		{
			int j=nums.length-1;
			while(nums[i-1]>=nums[j])
			{
				j--;
			}
			swap(nums,i-1,j);
		}
		reverse(nums,i,nums.length-1);
	}
	private void reverse(int [] nums,int i,int j)
	{
		while(i<j)
		{
			swap(nums,i,j);
			i++;
			j--;
		}
	}
	private void swap(int [] nums,int i,int j)
	{
		int temp=nums[j];
		nums[j]=nums[i];
		nums[i]=temp;
	}
}
