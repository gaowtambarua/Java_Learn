package LeadCode_Solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Subsets_II {
	public Subsets_II()
	{
		int [] num={4,4,4,1,4};
		System.out.println(subsetsWithDup(num));
	}
	//	public List<List<Integer>> subsetsWithDup(int[] nums) {
	//		Arrays.sort(nums);
	//		List<List<Integer>> subset=new ArrayList<List<Integer>>();
	//		subset.add(new ArrayList<Integer>());
	//		for(int num : nums)
	//		{
	//			int n=subset.size();
	//			for(int i=0;i<n;i++)
	//			{
	//				List<Integer> subset2=new ArrayList<Integer>(subset.get(i));
	//				subset2.add(num);
	//				//Collections.sort(subset2,Collections.reverseOrder());
	//				if(!subset.contains(subset2))
	//				{
	//					subset.add(subset2);
	//				}
	//			}
	//		}
	//		return subset;
	//	}

	public List<List<Integer>> subsetsWithDup(int[] nums) {
		List<List<Integer>> res = new ArrayList<>();
		Arrays.sort(nums); // sort, duplicates together
		backtrack(nums, 0, new ArrayList<>(), res);
		return res;
	}
	private void backtrack(int[] nums, int start, List<Integer> path, List<List<Integer>> res) {
		res.add(new ArrayList<>(path));  // add current subset

		for (int i = start; i < nums.length; i++) {
			// skip duplicate elements
			if (i > start && nums[i] == nums[i-1]) continue;

			path.add(nums[i]);
			backtrack(nums, i + 1, path, res); // move forward
			path.remove(path.size() - 1); // undo
		}
	}

}
