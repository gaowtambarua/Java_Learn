package LeadCode_Solution;

public class Maximum_Count_of_Positive_Integer_and_Negative_Integer
{
	public Maximum_Count_of_Positive_Integer_and_Negative_Integer()
	{
		int [] nums = {0,1};
		System.out.println(maximumCount(nums));
	}
//	public int maximumCount(int[] nums) {
//		int minus=binarySearch(nums, 0);
//		int plus=nums.length-binarySearch(nums, 1);
//		return Math.max(minus, plus);
//	}
//	public int binarySearch(int [] nums,int target)
//	{
//		int left=0,right=nums.length;
//		while(left<right)
//		{
//			int mid=(left+right)/2;
//			if(nums[mid]<target)
//			{
//				left=mid+1;
//			}
//			else
//			{
//				right=mid;
//			}
//		}
//		return right;
//	}
//	
	
	public int maximumCount(int[] nums) {
		int minus=binarySearch(nums, 0);
		int plus=nums.length-binarySearch2(nums, 0);
		return Math.max(minus, plus);
	}
	public int binarySearch(int [] nums,int target)
	{
		int left=0,right=nums.length;
		while(left<right)
		{
			int mid=(left+right)/2;
			if(nums[mid]<target)
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
	public int binarySearch2(int [] nums,int target)
	{
		int left=0,right=nums.length;
		while(left<right)
		{
			int mid=(left+right)/2;
			if(nums[mid]<=target)
			{
				left=mid+1;
			}
			else
			{
				right=mid;
			}
		}
		return left;
	}
	
	
	
	
}
