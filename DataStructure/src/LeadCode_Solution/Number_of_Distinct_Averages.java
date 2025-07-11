package LeadCode_Solution;

import java.util.Arrays;
import java.util.Hashtable;


public class Number_of_Distinct_Averages {
	public Number_of_Distinct_Averages()
	{
//		HashSet<Double> seen=new HashSet<Double>();
//		seen.add(2.5);
//		seen.add(2.7);
//		seen.add(3.6);
//		seen.add(2.7);
//		System.out.println(seen);
		
		int [] n={1,100};
		System.out.println(distinctAverages(n));
	}
	public int distinctAverages(int[] nums) {
		Arrays.sort(nums);
		
		Hashtable<Double,Double> seen =new Hashtable<Double, Double>();
		int i=0,j=nums.length-1;
		 while(i<j)
		 {
			 seen.put((double)(nums[i]+nums[j])/2, (double)(nums[i]+nums[j])/2);
			 i++;
			 j--;
		 }
		return seen.size();
	}
}
