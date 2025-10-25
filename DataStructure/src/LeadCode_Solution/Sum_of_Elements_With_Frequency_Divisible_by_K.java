package LeadCode_Solution;

import java.util.HashMap;
import java.util.Hashtable;

public class Sum_of_Elements_With_Frequency_Divisible_by_K {
	public Sum_of_Elements_With_Frequency_Divisible_by_K()
	{
		int nums[]={1,2,2,3,3,3,3,4};
		System.out.println(sumDivisibleByK(nums,2));
	}
	public int sumDivisibleByK(int [] nums, int k) {
		//		int [] fre=new int [101];
		//		int sum=0;
		//		for(int num: nums)
		//		{
		//			fre[num]=fre[num]+1;
		//		}
		//		for(int i=1;i<=100;i++)
		//		{
		//			if((fre[i])%k==0)
		//			{
		//				sum=sum+(fre[i]*i); 
		//			}
		//		}
		//		return sum;

		HashMap<Integer,Integer>fre=new HashMap<Integer,Integer>();
		for(int val : nums)
		{
			fre.put(val,fre.getOrDefault(val,0)+1);
		}
		int sum=0;
		for(int val:fre.keySet())
		{
			if(fre.get(val)%k==0)
			{
				sum=sum+(fre.get(val))*val;
			}
		}
		return sum;

	}
}
