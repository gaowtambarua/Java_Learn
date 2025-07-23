package Algoritham.Search;

public class Find_Minus_Plus_Number_Using_Binary_Serarch  {
	public Find_Minus_Plus_Number_Using_Binary_Serarch( )
	{
		int [] num={0,0};
		System.out.println(maximumCount(num));
	}
	
	public int maximumCount(int[] num) {
		int plus=num.length-(search(num,1));
		int minus=search(num,0);
		return Math.max(minus, plus);
	}
	
	public int search(int[] nums, int target) {
		int left=0,right=nums.length-1;
		while(left<=right)
		{
			int mid=(left+right)/2;
			if(nums[mid]>=target)
			{
				right=mid-1;
			}
			else
			{
				left=mid+1;
			}
		}
			
		return left;
    }
}
