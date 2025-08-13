package LeadCode_Solution;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Bitwise_ORs_of_Subarrays {
	public Bitwise_ORs_of_Subarrays()
	{
		int [] arr = {1,2,4};
		System.out.println(subarrayBitwiseORs(arr));
	}
	public int subarrayBitwiseORs(int[] arr) {
		Set<Integer> result=new HashSet<Integer>();
		Set<Integer> dp=new HashSet<Integer>();
		for(int num : arr)
		{
			Set<Integer> present=new HashSet<Integer>();
			present.add(num);
			for(int val:dp)
			{
				present.add(num|val);
			}
			dp=present;
			result.addAll(dp);
		}
		
		return result.size();
	}
}
