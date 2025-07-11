package LeadCode_Solution;

import java.util.Arrays;

public class NextPermutation {
	public NextPermutation()
	{
		int[] nums = {1,5,1};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
	}
	public void nextPermutation(int[] nums) {
		int i=nums.length-2;
		while(i>=0&&nums[i]>=nums[i+1])
		{
			i--;
		}
		System.out.println(i);
		if(i>=0)
		{
			int j=nums.length-1;
			while(nums[i]>=nums[j])
			{
				j--;
			}
			swap(nums,i,j);
		}
		reverse(nums,i+1,nums.length-1);
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
	private void swap(int [] nums,int i, int j)
	{
		int temp=nums[j];
		nums[j]=nums[i];
		nums[i]=temp;
	}
}
