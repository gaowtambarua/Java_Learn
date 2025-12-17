package Algoritham.Search;

public class BinarySearch2 {
	public BinarySearch2()
	{
		int[] nums = {2, 5, 8, 12, 16, 23, 38, 45, 56};
		int target = 23;
		int result = binarySearch(nums, target);
		System.out.println(result);
	}
	public int binarySearch(int [] nums,int target)
	{
		int start =0;
		int end=nums.length-1;

		while(start<=end)
		{
			int mid = (start + end) / 2;  // (start + (end-start) / 2)
			if (nums[mid] == target) {
				return mid;
			}
			else if(nums[mid]<target)
			{
				start=mid+1;
			}
			else if(nums[mid]>target)
			{
				end=mid-1;
			}
		}

		return -1;
	}
}
