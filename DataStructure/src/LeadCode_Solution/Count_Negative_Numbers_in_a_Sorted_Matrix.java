package LeadCode_Solution;

import java.util.Arrays;

public class Count_Negative_Numbers_in_a_Sorted_Matrix {
	public Count_Negative_Numbers_in_a_Sorted_Matrix()
	{
		int [][] grid = {
				{3,2},
				{1,0},
				{0,0},
				{0}
		};
		System.out.println(countNegatives(grid));
	}
	public int countNegatives(int[][] grid) {
		int count=0;
		for(int i=0;i<grid.length;i++)
		{
			int []temp=Arrays.copyOf(grid[i],grid[i].length);
			int minus=binarySearch(grid[i],0);
			count=count+(grid[i].length-minus);
		}
		return count;
	}
	private int binarySearch(int [] nums,int terget)
	{
		int left=0,right=nums.length;
		while(left<right)
		{
			int mid=(left+right)/2;
			if(nums[mid]>=terget)
			{
				left=mid+1;
			}
			else
			{
				right=mid;
			}
		}
		return right;
	}
}
