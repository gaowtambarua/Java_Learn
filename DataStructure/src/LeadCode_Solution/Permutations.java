package LeadCode_Solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {
	public Permutations(){
		int [] nums={1,2,3};
		System.out.println(permute(nums));
	}

	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> result=new ArrayList<List<Integer>>();
		List<Integer> temp=new ArrayList<Integer>();
		boolean [] used=new boolean [nums.length];
		backTracking(nums,temp,used,result);
		return result;
	}
	private void backTracking(int [] nums,List<Integer> temp,boolean [] used,List<List<Integer>>result)
	{
		if(nums.length==temp.size())
		{
			result.add(new ArrayList<>(temp));
			return;
		}
		
		for(int i=0;i<nums.length;i++)
		{
			if(used[i])
			{
				continue;
			}
			temp.add(nums[i]);
			used[i]=true;
			backTracking(nums,temp,used,result);
			temp.remove(temp.size()-1);
			used[i]=false;
		}
	}
}
