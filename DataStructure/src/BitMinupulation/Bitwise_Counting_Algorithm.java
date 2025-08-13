package BitMinupulation;

public class Bitwise_Counting_Algorithm {
	public Bitwise_Counting_Algorithm()
	{
		// 2,2,3,2
		int [] nums = {2,2,2};
		System.out.println(singleNumber(nums));
	}
	public int singleNumber(int[] nums) {
//		int result=0;
//		for(int i=0;i<32;i++)
//		{
//			int sum=0;(ones ^ num) & ~twos
//			for(int num:nums)
//			{
//				sum=sum+((num>>i)&1);
//			}
//			if(sum%3!=0)
//			{
//				 result=(1<<i)|result;
//			}
//		}
//		return result;
		
		int ones = 0, twos = 0;
		for (int num : nums) {
			
		    ones = (ones ^ num) & ~twos;
		    twos = (twos ^ num) & ~ones;
		}
		return twos;
	}
}
