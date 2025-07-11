package LeadCode_Solution;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
	public  Subsets()
	{
		int [] nums={1,2,3};
		System.out.println(subsets(nums));
	}
	public List<List<Integer>> subsets(int[] nums) {
		
		List<List<Integer>> num =new ArrayList<List<Integer>>();
		num.add(new ArrayList<Integer>());
		for(int present:nums)
		{
			int n=num.size();
			for(int i=0;i<n;i++)
			{
				List<Integer> present2 =new ArrayList<Integer>(num.get(i));
				present2.add(present);
				num.add(present2);
			}
		}
		return num;
	}
}
