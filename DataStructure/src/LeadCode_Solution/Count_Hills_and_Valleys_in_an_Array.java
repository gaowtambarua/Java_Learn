




package LeadCode_Solution;

public class Count_Hills_and_Valleys_in_an_Array {
	public Count_Hills_and_Valleys_in_an_Array()
	{
		int [] nums={90,86,86};
		System.out.println(countHillValley(nums));
	}
	public int countHillValley(int[] nums) {
		
		///////////// 2,4,1,1,1,5
		int count=0;
		for(int i=1;i<nums.length-1;i++)
		{

			if(nums[i]==nums[i-1])
			{
				continue;
			}
			int left = i - 1;
			while (left >= 0 && nums[left] == nums[i]) {
				left--;
			}
			
			int right=i+1;
			while(right<nums.length&&nums[i]==nums[right])
			{
				right++;
			}
			if (left >= 0 && right < nums.length) 
			if(nums[i]>nums[i-1]&&nums[i]>nums[right]||nums[i]<nums[i-1]&&nums[i]<nums[right])
			{
				count++;
			}
		}
		
		return count;
	}
	
//	public int countHillValley(int[] nums) {
//		int count = 0;
//
//		// nums[i] এর আগে এবং পরে non-equal প্রতিবেশী খুঁজি
//		for (int i = 1; i < nums.length - 1; i++) {
//			// যদি nums[i] == nums[i - 1] হয়, তাহলে skip না করে,
//			// আগে i কে এমন জায়গায় নিয়ে যাই যেখানে nums[i] ≠ nums[i-1]
//			if (nums[i] == nums[i - 1]) continue;
//
//			int left = i - 1;
//			while (left >= 0 && nums[left] == nums[i]) {
//				left--;
//			}
//
//			int right = i + 1;
//			while (right < nums.length && nums[right] == nums[i]) {
//				right++;
//			}
//
//			// এখন যদি দুই পাশে valid non-equal সংখ্যা থাকে, তবে চেক করবো
//			if (left >= 0 && right < nums.length) {
//				if (nums[left] < nums[i] && nums[right] < nums[i]) {
//					// Hill
//					count++;
//				} else if (nums[left] > nums[i] && nums[right] > nums[i]) {
//					// Valley
//					count++;
//				}
//			}
//		}
//
//		return count;
//	}

}
