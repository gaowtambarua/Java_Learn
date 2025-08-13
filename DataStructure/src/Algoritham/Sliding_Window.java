package Algoritham;

import java.util.Arrays;

public class Sliding_Window {
	public Sliding_Window()
	{
		int [] nums = {1,12,-5,-6,50,3};
		int k = 4;
		//System.out.println(findMaxAverage(nums, k));
		
		//////////////////////////////////
		
		String s = "AABB"; 
		 k = 1;
		
		
		System.out.println(characterReplacement(s, k));
	}
	
	public int characterReplacement(String s, int k) {
		int n=s.length();
		int max=0,left=0,result=0;
		int count[]=new int[26];
		for(int right=0;right<n;right++)
		{
			char ch=s.charAt(right);
			count[ch-'A']++;
			max=Math.max(max, count[ch-'A']);
			while((right-left+1-max)>k)
			{
				char lchar=s.charAt(left);
				count[lchar-'A']--;
				left++;
			}
			result=Math.max(result, right-left+1);
		}
		return result;
	}
	
	public double findMaxAverage(int[] nums, int k) {
		int windowSum =0;
		for(int i=0;i<k;i++)
		{
			windowSum =windowSum +nums[i];
		}
		int maxSum = windowSum; 
		for(int i=k;i<nums.length;i++)
		{
			windowSum =windowSum +nums[i]-nums[i-k];
			maxSum=Math.max(maxSum, windowSum);
		}
		return (double)maxSum/k;
	}
}
