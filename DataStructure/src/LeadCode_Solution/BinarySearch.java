package LeadCode_Solution;

public class BinarySearch {
	public BinarySearch()
	{
		int [] nums = {-1,0,3,5,9,12};
		int target = -2;
		System.out.println(search(nums,target));
	}
	public int search(int[] nums, int target) {
		int start=0,end=nums.length-1;
		while(start<=end)
		{
			int mid=(start+end)/2;
			if(nums[mid]<target)
			{
				start=mid+1;
			}
			else if(nums[mid]>target)
			{
				end=mid-1;
			}
			else
			{
				return mid;
			}
		}
		return -1;
	}
}
