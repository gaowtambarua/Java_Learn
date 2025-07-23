package LeadCode_Solution;

public class Search_in_Rotated_Sorted_Array {

	public Search_in_Rotated_Sorted_Array()
	{
		int [] nums={9,10,11,15,1,2,3,10};
		System.out.println(search(nums, 10));
	}

	public int search(int[] nums, int target) {
		int left = 0, right = nums.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (nums[mid] == target)
			{
				return mid;
			}
			else if(nums[mid]<nums[right]){
				if(target>nums[mid]&&target<=nums[right])
				{
					left=mid+1;
				}
				else
				{
					right=mid-1;
				}
			}
			else
			{
				if(target>=nums[left]&&target<nums[mid])
				{
					right=mid-1;
				}
				else
				{
					left=mid+1;
				}
			}

			//	        // Left half is sorted
			//	        if (nums[left] <= nums[mid]) {
			//	            if (target >= nums[left] && target < nums[mid]) {
			//	                right = mid - 1;
			//	            } else {
			//	                left = mid + 1;
			//	            }
			//	        }
			//	        // Right half is sorted
			//	        else {
			//	            if (target > nums[mid] && target <= nums[right]) {
			//	                left = mid + 1;
			//	            } else {
			//	                right = mid - 1;
			//	            }
			//	        }
		}

		return -1;
	}
}
