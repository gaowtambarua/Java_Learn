package Algoritham;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Backtracking {
	public Backtracking ()
	{
		 int[] nums = {3,2,1,5}; /// [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].
	        List<List<Integer>> result = new ArrayList<>();
	        List<Integer> temp = new ArrayList<>();
	        boolean[] used = new boolean[nums.length];

	        backtrack(nums, temp, used, result);

	        // ফলাফল প্রিন্ট করা
	        for (List<Integer> perm : result) {
	            System.out.println(perm);
	        }
	        
	}
	
	 static void backtrack(int[] nums, List<Integer> temp, boolean[] used, List<List<Integer>> result) {
	        // **Base case**
	        if (temp.size() == nums.length) {
	            result.add(new ArrayList<>(temp)); // সমাধান পেলে কপি করে রাখো
	            return;
	        }

	        // **Choices**
	        for (int i = 0; i < nums.length; i++) {
	            if (used[i]) continue; // এই সংখ্যা আগে ব্যবহার হলে বাদ দাও

	            // **Choose**
	            temp.add(nums[i]);
	            used[i] = true;

	            // **Explore**
	            backtrack(nums, temp, used, result);

	            temp.remove(temp.size() - 1);
	            used[i] = false;
	        }
	    }
}
