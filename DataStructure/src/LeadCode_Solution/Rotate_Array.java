package LeadCode_Solution;

import java.util.Arrays;

public class Rotate_Array {
	public Rotate_Array()
	{
		int [] nums={-1};
		rotate(nums,2);
		System.out.println(Arrays.toString(nums));
	}
	//	public void rotate(int[] nums, int k) {
	//		int num[]=new int[nums.length];
	//		for(int i=0;i<k;i++)
	//		{
	//			//num=(num-1+nums.length)%nums.length;
	//			//System.out.println(nums[num]);
	//			for(int j=0;j<nums.length;j++)
	//			{
	//				
	//				num[(j+nums.length+1)%nums.length]=nums[j];
	//			}
	//			
	//			//nums=Arrays.copyOf(num, num.length);
	//			System.arraycopy(num, 0, nums, 0, nums.length);
	//		}
	//		System.out.println(Arrays.toString(nums));
	//	}

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
