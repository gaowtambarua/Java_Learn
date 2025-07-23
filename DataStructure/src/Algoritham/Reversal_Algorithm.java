package Algoritham;

import java.util.Arrays;

public class Reversal_Algorithm {
	public Reversal_Algorithm()
	{
		int [] nums={-1};
		rotate(nums,2);
		System.out.println(Arrays.toString(nums));
	}
	public void rotate(int[] nums, int k) {
		k=k%nums.length;
		reverse(0,nums,nums.length-1);
		reverse(0,nums,k-1);
		reverse(k,nums,nums.length-1);
	}
	private void reverse(int i,int [] nums,int n)
	{
		while(i<=n)
		{
			//1,2,3,4,5,6,7
			int temp=nums[n];
			nums[n]=nums[i];
			nums[i]=temp;
			i++;
			n--;
		}
	}
}
